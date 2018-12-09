
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * UVa ID: 489
 * @author mancipox
 */
public class Hangman {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int round = Integer.parseInt(bf.readLine());
        do {
            String solution = bf.readLine();
            String actual = bf.readLine();
            for (int i = 0; i < actual.length(); i++) {
                char xd = actual.charAt(i);
                actual = actual.replace("" + xd, "-");
                actual = actual.replaceFirst("-", "" + xd);
                actual = actual.replace("-", "");
            }
            int errors = 0;
            boolean chick = false;
            for (int i = 0; i < actual.length(); i++) {
                if (solution.contains("" + actual.charAt(i))) {
                    solution = solution.replace("" + actual.charAt(i), "");
                    if (solution.length() == 0 && errors < 7) {
                        System.out.println("Round " + round + "\nYou win.");
                        chick = true;
                        break;
                    }
                } else {
                    errors++;
                    if (errors >= 7) {
                        System.out.println("Round " + round + "\nYou lose.");
                        chick = true;
                        break;
                    }
                }
            }
            if (!chick) {
                System.out.println("Round " + round + "\nYou chickened out.");
            }

        } while ((round = Integer.parseInt(bf.readLine())) != -1);
    }
}
