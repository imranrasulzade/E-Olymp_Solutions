import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a[] = new int [1001];
        
        int b, d, e;
        
        for(b = 1;b <= k; b++)
        {
            d = scan.nextInt();
            e = scan.nextInt();
            for(int i = d; i <= e; i++)
                a[i]++;
        }
        int m = a[0];
        for(int i = 1;i <= 1000; i++)
            if(a[i] > m)
                m = a[i];
                
        System.out.println(m);
            
  
    }
}