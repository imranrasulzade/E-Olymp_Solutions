import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        if(a.compareTo(b) > 0)
        System.out.println(">");
       else if(a.compareTo(b) < 0)
       System.out.println("<");
       else if(a.compareTo(b) == 0)
       System.out.println("=");
    }
}