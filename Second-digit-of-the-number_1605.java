import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long m = 0;
		if(a < 0)
		    a = -a;
    		while(a > 10)
               {
            	   m = a % 10;
                     a /= 10;
               }
               System.out.println(m);
		    
		
        
	}
}