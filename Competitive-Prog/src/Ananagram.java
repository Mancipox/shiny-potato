
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * UVa ID: 11947
 * @author mancipox
 */
public class Ananagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words_raw = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        String raw_input =bf.readLine();
        do{
            String[] dict = raw_input.trim().replaceAll(" +", " ").split(" "); //Regular expression to left just one space between words
            for (String dict1 : dict) {
                words_raw.add(dict1.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()); //To sort every word in alphabetical order
                words.add(dict1);
            }
        }while(!(raw_input=bf.readLine()).equals("#"));
        for (String word : words_raw) {
            if(Collections.frequency(words_raw, word)==1 && !output.contains(word)){
                output.add(words.get(words_raw.indexOf(word)));
            }
        }
        Collections.sort(output); //Sort by first character
        output.forEach((string) -> {
            System.out.println(string);
        });
    }
}
