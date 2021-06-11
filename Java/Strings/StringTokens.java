import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

            String[] ar = s.trim().split("[ !,?.\\_'@]+");
        
        if (s == null || s.trim().equals("")) {
           System.out.println("0");
 }
        else{
             System.out.println(ar.length);    
        

        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
        }

        scan.close();
    }
}
