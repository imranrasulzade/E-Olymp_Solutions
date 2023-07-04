import java.util.*;

public class Main  
{  
public static void main(String[] args)   
      {  
        Scanner sc=new Scanner (System.in);
            long  n = sc.nextInt();
            long k = sc.nextInt();
            long say = 0; 
            long r;
             while(n>0 || n<0)
             {
                  r = n % 10;
                  n = n / 10;
                  if(r == k || r == -k)
                        say++;
             }
            
                  System.out.println(say);  
                  
            
            
      }  
}