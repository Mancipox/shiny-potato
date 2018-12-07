
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mancipox
 */
public class JavaTest {

    public static void main(String[] args) {
        //Permutation with recursion
        //Use permute and swap methods
        //Source: https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
        String str = "ABCDEFGHIJ"; 
        int n = str.length();
        permute(str, 0, n-1);
    }
    
    public static void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    }
    
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 

    public void n_values_of_Pi() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String format = "#.";
        for (int i = 0; i < n; i++) {
            format += "#";
        }
        DecimalFormat df = new DecimalFormat(format);
        String formatted = df.format(Math.PI);
        System.out.println(formatted);
    }

    public void day_of_a_Date() {
        //year in constructor = year desired - 1900
        //months in constructor begin at 0 to 11
        Date dt = new Date(2018 - 1900, 11, 24);
        switch (dt.getDay()) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    public void random_array_Sorted() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
    public static void order_dates_mult_choices(){
        //Use the date_string static class 
        date_string[] dates = new date_string[4];
        dates[0] = new date_string("15", "12", "2000");
        dates[1] = new date_string("25", "2", "2000");
        dates[2] = new date_string("1", "3", "1998");
        dates[3] = new date_string("2", "1", "2004");
        Arrays.sort(dates, new date_string("day"));
        System.out.println("Orderer days "+Arrays.toString(dates));
        Arrays.sort(dates, new date_string("month"));
        System.out.println("Orderer months "+Arrays.toString(dates));
        Arrays.sort(dates, new date_string("year"));
        System.out.println("Orderer years "+Arrays.toString(dates));
    }
    
    static class date_string implements Comparator<date_string>{
        public int date;
        public int month;
        public int year;
        public String compareBy="day";
        
        public date_string(String Date, String Month, String Year) {
            date = Integer.parseInt(Date);
            month = Integer.parseInt(Month);
            year = Integer.parseInt(Year);
        }
        
        public date_string(String compareBy){
            this.compareBy=compareBy;
        }

        @Override
        public String toString() {
            return "Day: "+date+" Month: "+month+" Year: "+year;
        }

        //compare method from Comparator
        //You can use more than one condition to compare
        @Override
        public int compare(date_string o1, date_string o2) {
            switch(compareBy){
                case ("day"):return (o1.date-o2.date);
                case ("month"):return (o1.month-o2.month);
                case ("year"): return (o1.year-o2.year);
            }
            return (o1.date-o2.date);
        }
        
    }
}
