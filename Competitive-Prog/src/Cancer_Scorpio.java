
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * AC but get error in uDebug cases ?
 * UVa ID: 11947
 * @author mancipox
 */
public class Cancer_Scorpio {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(bf.readLine()), count = 1;
        while (cases-- != 0) {
            String raw_date = bf.readLine();
            GregorianCalendar gc = new GregorianCalendar(Integer.parseInt(raw_date.substring(4, 8)), Integer.parseInt(raw_date.substring(0, 2)) - 1, Integer.parseInt(raw_date.substring(2, 4)));
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
            gc.add(Calendar.WEEK_OF_YEAR, 40);
            String final_date = sdf.format(gc.getTime());
            String zodiac = "";
            int month = Integer.parseInt(final_date.substring(0, 2));
            int day = Integer.parseInt(final_date.substring(3, 5));
            if ((month == 12 && day >= 23 && day <= 31) || (month == 1 && day >= 1 && day <= 20)) {
                zodiac = "capricorn";
            } else if ((month == 1 && day >= 21 && day <= 31) || (month == 2 && day >= 1 && day <= 19)) {
                zodiac = "aquarius";
            } else if ((month == 2 && day >= 20 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) {
                zodiac = "pisces";
            } else if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 20)) {
                zodiac = "aries";
            } else if ((month == 4 && day >= 21 && day <= 30) || (month == 5 && day >= 1 && day <= 21)) {
                zodiac = "taurus";
            } else if ((month == 5 && day >= 22 && day <= 31) || (month == 6 && day >= 1 && day <= 21)) {
                zodiac = "gemini";
            } else if ((month == 6 && day >= 22 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
                zodiac = "cancer";
            } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 21)) {
                zodiac = "leo";
            } else if ((month == 8 && day >= 22 && day <= 31) || (month == 9 && day >= 1 && day <= 23)) {
                zodiac = "virgo";
            } else if ((month == 9 && day >= 24 && day <= 30) || (month == 10 && day >= 1 && day <= 23)) {
                zodiac = "libra";
            } else if ((month == 10 && day >= 24 && day <= 31) || (month == 11 && day >= 1 && day <= 22)) {
                zodiac = "scorpio";
            } else if ((month == 11 && day >= 23 && day <= 30) || (month == 12 && day >= 1 && day <= 22)) {
                zodiac = "sagittarius";
            }
            System.out.println(count++ + " " + final_date + " " +zodiac);
        }

    }
}

