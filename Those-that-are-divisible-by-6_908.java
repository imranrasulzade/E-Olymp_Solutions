import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[]=new int[n];
	int k;
	
	for(int i = 0;i < n;i++)
	{
	    k = sc.nextInt();
	    a[i] = k;
	}
	 int cem = 0, say = 0;
	 for(int j = 0;j < a.length;j++)
	 {
	     if(a[j] % 6 == 0 && a[j] > 0)
	     {
	         say++;
	         cem += a[j];
	     }
	 }
	 System.out.print(say+" "+cem);
}
}