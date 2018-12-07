/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mancipox
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * UVa: 11727
 * @author yellow
 */
public class Cost_Cutting{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(bf.readLine());
        int[] array = new int[3];
        int case_num = 1;
        while (cases--!=0){
            String[] s = bf.readLine().split(" ");
            array[0]=Integer.parseInt(s[0]);
            array[1]=Integer.parseInt(s[1]);
            array[2]=Integer.parseInt(s[2]);
            Arrays.sort(array);
            System.out.println("Case "+case_num+++": "+array[1]);
        }
       
    }
    
}
