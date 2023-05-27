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
	    a[i] = k;
	}   
	    double min = 150000;
	    double max = 2.5;
	     for(int j = 0;j < a.length;j++)
	    {
	     if(a[j]  <= 2.5)
	     {
	         if(a[j] < min)
	         min = a[j];
	         
	        System.out.print((j+1)+" ");
	        System.out.printf("%.2f",a[j]);
	        break;
	     }
	     if(a[j] > max)
	     max = a[j];
	    }
	    if(min > 2.5  && max >= 2.5)
	   System.out.println("Not Found");
	    
	  
}
}