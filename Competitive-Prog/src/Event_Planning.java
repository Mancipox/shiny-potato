
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * UVa: 11559
 * @author mancipox
 */
public class Event_Planning {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String in = bf.readLine();
            if(in==null || in.isEmpty()) break;
            String[] input = in.split(" ");
            int partic = Integer.parseInt(input[0]);
            int aval = Integer.parseInt(input[1]);
            int hotel = Integer.parseInt(input[2]);
            int days = Integer.parseInt(input[3]), min = Integer.MAX_VALUE;
            while (hotel-- != 0) {
                int price_ind = Integer.parseInt(bf.readLine());
                String[] days_hotel = bf.readLine().split(" ");
                if (price_ind * partic <= aval) {
                    boolean works = false;
                    for (int i = 0; i < days; i++) {
                        if (Integer.parseInt(days_hotel[i]) > partic) {
                            works = true;
                            break;
                        }
                    }
                    if (works && min > price_ind * partic) {
                        min = price_ind * partic;
                    }
                }
            }
            System.out.println((min == Integer.MAX_VALUE) ? "stay home" : min);
        }

    }
}
