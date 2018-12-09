
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * UVa ID: 573
 * @author mancipox
 */
public class Snail {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        do{
            double H = Double.parseDouble(input[0]);
            double U = Double.parseDouble(input[1]);
            double D = Double.parseDouble(input[2]);
            double F = (Double.parseDouble(input[3]))/100*U,total_up=0,up_temp=U;
            int day = 1;
            while(true){
                total_up+=up_temp;
                if(total_up>H){
                    System.out.println("success on day "+day);
                    break;
                }else if(total_up<0){
                    System.out.println("failure on day "+day);
                    break;
                }
                total_up-=D;
                if(total_up<0){
                    System.out.println("failure on day "+day);
                    break;
                }
                day++;
                up_temp-=F;
                if(up_temp<0){
                    up_temp=0;
                }
            }
        }while(!(input=bf.readLine().split(" "))[0].equals("0"));
    }
}
