import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {



    public static String findDay(int month, int day, int year) {
       /* int dd = day;
        int mm = month;
        int yy = year;
        
        Date date = (new GregorianCalendar(yy,mm-1,dd)).getTime();
        SimpleDateFormat f = new SimpleDateFormat("EEEE");
        String stringDay = f.format(date);
        return stringDay.toUpperCase();*/
        
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1 , day);
        String dayOfWeek = "";

        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
        }

        return dayOfWeek.toUpperCase();
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}