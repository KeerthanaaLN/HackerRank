import java.io.*;
import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);

        return Arrays.equals(aa, bb);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().toLowerCase();;
        String b = in.nextLine().toLowerCase();;
        in.close();

        System.out.println((isAnagram(a, b)) ? "Anagrams" : "Not Anagrams");
    }
}
