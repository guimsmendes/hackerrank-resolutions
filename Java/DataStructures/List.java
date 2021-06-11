import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i<n;i++){
            int m = sc.nextInt();
            list.add(m);
        }
        int q = sc.nextInt();
        for(int i = 0;i<q;i++){
            
            String myString = sc.next();
            if(myString.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();

                list.add(x,y);
            }
            else{
                int x = sc.nextInt();

                list.remove(x);
            }
        }
        sc.close();
        
        for(Integer num : list){
        System.out.print(num + " ");}
    }
}