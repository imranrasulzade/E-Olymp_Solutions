import java.util.*;

public class Main {
   public static void main(String args[])
   {
      int a, b, c;
      
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
     
     b = a / 100;
     c = a % 10;
     if(a >= 100 && a <= 999) 
     {
        if(b > c)
         System.out.println(b);
        else if(c > b)
         System.out.println(c);
        else
         System.out.println("=");
      } 
      }
    }