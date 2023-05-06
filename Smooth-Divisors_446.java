import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		long say = 0;
		
		long n = sc.nextInt();
		
		for(int i = 1; i < n ; i++)
		{
		      if((n/i)==(n%i))
		      say = say + 1;
		}
		System.out.println(say);
		
	}
}