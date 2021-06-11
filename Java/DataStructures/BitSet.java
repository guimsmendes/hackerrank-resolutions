import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(N);

        for(int i =0; i< M; i++){
            String myString = sc.next();
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();

            if(myString.contentEquals("AND")){
                if(s1 == 1) b1.and(b2);
                else b2.and(b1);
                } else if(myString.contentEquals("OR")){
                    if(s1 == 1) b1.or(b2);
                    else b2.or(b1);
            }else if(myString.contentEquals("XOR")){
                if(s1==1) b1.xor(b2);
                else b2.xor(b1);
            } else if(myString.contentEquals("FLIP")){
                if(s1==1) b1.flip(s2);
                else b2.flip(s2);
            }else {
               if(s1==1) b1.set(s2);
               else b2.set(s2);
            }

            System.out.println(b1.cardinality() +" "+ b2.cardinality());

        }

    }
}
