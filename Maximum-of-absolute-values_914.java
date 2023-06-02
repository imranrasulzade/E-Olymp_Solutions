import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	double a[]=new double[n];
	double k;
	
	for(int i = 0;i < n;i++)
	{
	    k = sc.nextDouble();
	    if(k >= 0)
	        a[i] = k;
	   else
	        a[i] = -k;
	    
	}
	 double max = a[0];
	 for(int j = 0;j < a.length;j++)
	 {
	     if(a[j] > max)
	     {
	         max = a[j];
	     }
	 }
	 System.out.printf("%.2f",max);
}
}