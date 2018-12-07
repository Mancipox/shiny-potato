
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * UVa: 10114
 * @author mancipox
 */
public class Loansome_Car {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] data_or = bf.readLine().split(" ");
        do {
            int duration = Integer.parseInt(data_or[0]);
            double initial_pay = Double.parseDouble(data_or[1]); //500
            double total_loan = Double.parseDouble(data_or[2]); //15000
            int deprec = Integer.parseInt(data_or[3]);
            double[] rates_deprec = new double[duration + 1];
            String[] rate_temp = new String[deprec];
            double temp_rate = 0.0f;

            for (int i = 0; i < deprec; i++) {
                rate_temp[i] = bf.readLine();
            }

            boolean exists;
            for (int i = 0; i <= duration; i++) {
                exists = false;
                for (int j = 0; j < rate_temp.length; j++) {
                    if (Integer.parseInt(rate_temp[j].split(" ")[0]) == i) {
                        exists = true;
                        temp_rate = Double.parseDouble(rate_temp[j].split(" ")[1]);
                        rates_deprec[i] = temp_rate;
                        break;
                    }
                }
                if (!exists) {
                    rates_deprec[i] = temp_rate;
                }
            }
            double initial_value = total_loan + initial_pay;
            double month_install = total_loan / duration;

            double amont_deprc = initial_value * (1 - rates_deprec[0]), amont_deprc2 = total_loan;
            if (amont_deprc2<amont_deprc) {
                System.out.println("0 months");
            } else {
                for (int i = 1; i <= duration; i++) {
                    amont_deprc = amont_deprc * (1 - rates_deprec[i]);
                    amont_deprc2 -= month_install;
                    if (amont_deprc2 < amont_deprc) {
                        System.out.println((i == 1) ? "1 month" : i + " months");
                        break;
                    }
                }
            }

            data_or = bf.readLine().split(" ");
        } while (data_or[0].charAt(0) != '-');
    }
}
