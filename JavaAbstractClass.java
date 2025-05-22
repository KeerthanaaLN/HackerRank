import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

public class JavaAbstractClass extends Book {

    void setTitle(String s){
        title = s;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Book MyBook = new Solution();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        MyBook.setTitle(s);
        System.out.println("The title is: "+ MyBook.getTitle());
    }
}
