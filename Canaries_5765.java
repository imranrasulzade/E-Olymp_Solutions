import java.util.*;

public class Main {
   public static void main(String args[]){
      int k, n;
      
      Scanner sc = new Scanner(System.in);
      k = sc.nextInt();
      n = sc.nextInt();
      
      if(k%n == 0)
      {
            long min = k/n;
            long max = k-(n-1);
            System.out.println(min+" "+max);
      }
      else{
            long min1 = k/n+1;
            long max1 = k-(n-1);
             System.out.println(min1+" "+max1);
      }
      
     }
      
      }