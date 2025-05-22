import java.io.*;
import java.util.*;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}


public class JavaMethodOverriding {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Sports s = new Sports();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
        Sports s1 = new Soccer();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();
    }
}
