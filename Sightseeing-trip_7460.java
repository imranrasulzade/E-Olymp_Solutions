import java.util.*;

public class Main {
   public static void main(String args[]){
      int o, q, k, o1, q1;
      
      Scanner sc = new Scanner(System.in);
      o = sc.nextInt();
      q = sc.nextInt();
      k = sc.nextInt();
      
     
                 if(o%k==0)
            o1 = o/k;
      else
            o1 = (o/k)+1;
            
      if(q%k==0)
            q1 = q/k;
      else
            q1 = (q/k)+1;
      

            System.out.println(o1 + q1);
      
      
      
       }
      }