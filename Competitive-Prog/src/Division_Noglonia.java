
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * UVa: 11498
 * @author mancipox
 */
public class Division_Noglonia {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        do {
            int origin_x;
            int origin_y;
            String[] orig_strg = bf.readLine().split(" ");
            origin_x = Integer.parseInt(orig_strg[0]);
            origin_y = Integer.parseInt(orig_strg[1]);

            while (k-- != 0) {
                String[] markers = bf.readLine().split(" ");
                int a;
                int b;
                try {
                    a = Integer.parseInt(markers[0]);
                    b = Integer.parseInt(markers[1]);
                } catch (Exception e) {
                    break;
                }
                if (a == origin_x || b == origin_y) {
                    System.out.println("divisa");
                } else if (a > origin_x && b > origin_y) {
                    System.out.println("NE");
                } else if (a > origin_x && b < origin_y) {
                    System.out.println("SE");
                } else if (a < origin_x && b > origin_y) {
                    System.out.println("NO");
                } else {
                    System.out.println("SO");
                }
            }
        }while((k=Integer.parseInt(bf.readLine()))!=0);
    }
}
