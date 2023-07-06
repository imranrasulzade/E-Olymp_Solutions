import java.util.*;

public class Main {
   public static void main(String args[]){
      long qefes, dovsan;
      
      Scanner sc = new Scanner(System.in);
      qefes = sc.nextInt();
      dovsan = sc.nextInt();
     
      if(qefes>=1 && dovsan <= 1000000000)
      {
            if(dovsan % qefes == 0)
            System.out.println((dovsan / qefes));
      else
            System.out.println((dovsan / qefes)+1);
      }
      
     }
      
      }