import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      int a = 0;
		Scanner sc = new Scanner(System.in);
		float l = sc.nextFloat();
		float k = sc.nextFloat();
		while(l>1)
		{
		      l /= k;
		      a++;
		}
		if(a==0)
		System.out.println(a);
		else
		System.out.println(a-1);
		
		
	}
}