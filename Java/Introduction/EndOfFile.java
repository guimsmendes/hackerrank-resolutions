import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=0;

        while(sc.hasNext()) {
            String inputString = sc.nextLine();
            n++;
            System.out.println(n + " " + inputString); 
        }
    }
}