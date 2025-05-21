import java.io.*;
import java.util.*;
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Remove empty strings that can occur due to splitting
        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }
        
        // Print the number of tokens
        System.out.println(count);
        
        // Print each token
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}

