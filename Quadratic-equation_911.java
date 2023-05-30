import java.util.*;

public class Main {
   public static void main(String args[]){
      double a, b, c, d;
      double x1, x2;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      
      d = (b*b) - (4*a*c);
      x1 = (-b - Math.sqrt(d)) / (2*a);
      x2 = (-b + Math.sqrt(d)) / (2*a);
      int ix1 = (int)x1;
      int ix2 = (int)x2;
      
      if (d == 0){
         System.out.println("One root: "+ (int)((-b)/(2*a)));
      } 
       else if(d < 0){
         System.out.println("No roots");
      } 
       else if(d > 0){
             if(ix1 < ix2)
                  System.out.println("Two roots: "+ ix1 +" "+ ix2);
            else if(ix2 < ix1)
                  System.out.println("Two roots: "+ ix2 +" "+ ix1);
      }
       
   }
}