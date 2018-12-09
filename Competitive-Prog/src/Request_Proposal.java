
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * UVa ID: 10141
 * @author mancipox
 */
public class Request_Proposal {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int cont = 1,num_req,total_prop;
        double value_temp = 0.0, final_value = 0.0;
        int count_req = 0, max = 0;
        String name_temp = "", final_name = "";
        do {
            num_req = Integer.parseInt(input[0]);
            total_prop = Integer.parseInt(input[1]);
            for (int i = 0; i < num_req; i++) {
                bf.readLine();
            }
            for (int i = 0; i < total_prop; i++) {
                name_temp = bf.readLine();
                String[] tmp = bf.readLine().split(" ");
                value_temp = Double.parseDouble(tmp[0]);
                count_req = Integer.parseInt(tmp[1]);
                for (int j = 0; j < count_req; j++) {
                    bf.readLine();
                }
                if (max < count_req) {
                    final_name = name_temp;
                    max = count_req;
                    final_value = value_temp;
                } else if (max == count_req) {
                    if (final_value > value_temp) {
                        final_name = name_temp;
                        final_value = value_temp;
                    }
                }
                count_req = 0;
            }
            input = bf.readLine().split(" ");
            if(!input[0].equals("0")){
                System.out.println("RFP #" + cont++ + "\n" + final_name + "\n");
            }else{
                System.out.print("RFP #" + cont++ + "\n" + final_name + "\n");
                break;
            }
            name_temp = ""; final_name = "";
            value_temp = 0.0; final_value = 0.0;
            count_req = 0; max = 0;
        } while (true);
    }
}
