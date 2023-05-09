import java.util.*;

public class Main {
   public static void main(String args[]){
      int n, l, w, h, s; 
      
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      
      for(int i=1; i<=n;i++)
      {
         l = sc.nextInt(); 
         w = sc.nextInt();
         h = sc.nextInt();
         
         s = 2*(l+w)*h;
         if(s%16==0)
            System.out.println(s/16);
         else
            System.out.println((s/16)+1);
      }
     
     
     
      
      }
       
   
}