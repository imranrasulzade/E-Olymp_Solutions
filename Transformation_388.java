import java.util.*;

public class Main
{
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	     long n = sc.nextLong();
	     long c = 0;
	     int say = 0;
	     while(n != 1)
	           {
	                 if(n % 2 == 0)
	                 n/=2;
	                 else
	                 n++;
	                 
	                 say++;
	           }
	            
	     System.out.println(say);
	}
}