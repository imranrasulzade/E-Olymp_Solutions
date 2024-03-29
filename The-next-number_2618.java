import java.util.Scanner;
 
public class Main 
{
	public static void main(String[] args) 
	{
    	String s = new Scanner(System.in).next();
    	StringBuilder sb = new StringBuilder();
    	int n = s.length(), c = 1;
    	for(int i=n-1; i>-1; i--) 
    	{
    		int v = s.charAt(i) - '0' + c;
    		c = v / 10;
    		sb.append(v%10);
    	    if(c == 0) 
    	    {
    			if(i > 0) sb.append(new StringBuilder(s.substring(0, i)).reverse());
    			break;
    		}
    	}
    	if(c == 1) sb.append(1);
    	System.out.println(sb.reverse().toString());
	}
}