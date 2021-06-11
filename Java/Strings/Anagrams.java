import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length()==b.length()){

            int m = 0;
            for(int i = 0; i<a.length(); i++){
                int k = 0;
                int l = 0;
                for(int j = 0;j<b.length(); j++){

                    if(a.charAt(i)==b.charAt(j)) k++;
                    
                    if(a.charAt(i)==a.charAt(j)) l++;
                
                }
                if(k == l) m++;

            }
                if(m==a.length()) return true;
                else return false;
        } else return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}