
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * UVa ID: 11799
 * @author mancipox
 */
public class Horror_Dash {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine()), cases=1;
        while(t--!=0){
            String[] v = bf.readLine().split(" ");
            int max_val = 0,temp=0;
            for (int i = 1; i < v.length; i++) {
                temp= Integer.parseInt(v[i]);
                max_val=(max_val<temp)?temp:max_val;
            }
            System.out.println("Case "+cases+++": "+max_val);
        }
    }
}
