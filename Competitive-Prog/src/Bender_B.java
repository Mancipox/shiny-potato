
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * UVa ID: 11507
 * @author mancipox
 */
public class Bender_B {
    public static Map<String,String> posibilities;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        String input = bf.readLine();
        do{
            int L = Integer.parseInt(input);
            String[] movements = bf.readLine().replace("No", "+x").split(" ");
            String mv = movements[0];
            for (int i = 1; i < movements.length; i++) {
                String next_mv = movements[i];
                mv = posibilities.get(mv+next_mv);
            }
            System.out.println(mv);
        }while(!(input=bf.readLine()).equals("0"));
    }
    
    public static void initialize(){
        posibilities = new HashMap<>();
        String[] axis = {"+z","-z","+y","-y","+x","-x"};
        for (String axi : axis) {
            for (int j = 0; j < axis.length-1; j++) {
                if (axi.equals(axis[j]) && !axi.equals("+x")) {
                    posibilities.put(axi + axis[j], "-x");
                } else if (axi.charAt(1) == axis[j].charAt(1) && !axi.equals("+x") && !axi.equals("-x")) {
                    posibilities.put(axi + axis[j], "+x");
                } else if (!axi.equals("+x") && !axi.equals("-x")) {
                    posibilities.put(axi + axis[j], axi);
                } else if (axi.equals("+x")) {
                    posibilities.put(axi + axis[j], axis[j]);
                } else {
                    posibilities.put(axi + axis[j], (axis[j].charAt(0)=='+')?axis[j].replace("+", "-"):axis[j].replace("-", "+"));
                }
            }
        }
    }
}
