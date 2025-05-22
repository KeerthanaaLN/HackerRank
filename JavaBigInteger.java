import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        String numOne = in.nextLine();
        String numTwo = in.nextLine();
        
        BigInteger one = new BigInteger(numOne);
        BigInteger two = new BigInteger(numTwo);
        
        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
        
        
    }
}
