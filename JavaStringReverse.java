import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        
        for(int i=0;i<A.length();i++){
            rev=A.charAt(i)+rev;
        }
        String result = A.equals(rev) ? "Yes" : "No";
        System.out.println(result);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



