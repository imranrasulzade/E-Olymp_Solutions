import java.util.*;

public class Main
{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int cem = 0, say = 0;
		double k;
		for(int i = 0; i < n; i++)
		 {
		  arr[i] = sc.nextInt();
		  cem += arr[i];
		 }
		k = cem / n;
	    
		for(int i = 0; i < n; i++)
		{
		   if(arr[i] > Math.round(k)) 
		   say++;
		}
		System.out.println(say);
	}
}