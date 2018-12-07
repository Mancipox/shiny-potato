
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * UVa ID: 11172
 * @author mancipox
 */
public class Relational_Operator {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t--!=0){
            String[] values = bf.readLine().split(" ");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int val = Integer.compare(a, b);
            switch(val){
                case -1:System.out.println("<");break;
                case 0:System.out.println("=");break;
                case 1:System.out.println(">");break;
            }
        }
    }
}
