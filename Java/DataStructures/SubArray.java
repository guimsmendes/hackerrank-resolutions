import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
    
        for(int i = 0; i<n;i++){
            if(a[i]<0){
                count++;

            }
            int sum = a[i];
            for(int j = i+1; j< n; j++){
                sum = sum + a[j];
                if(sum<0){
                    count++;
                }
            }
           
        }
        System.out.println(count);

    }
}
