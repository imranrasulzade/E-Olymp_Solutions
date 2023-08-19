import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int d, e, f, g, h;
	for(int i=a;i<=b;i++)
	{
	    d=i%10;
	    e=i/10%10;
	    f=i/100%10;
	    g=i/1000%10;
	    h=(d * d * d * d)+(e * e * e * e)+(f * f * f * f)+(g * g * g * g);
	    if(i==h)
	    System.out.print(i+" ");
	    
	}
	
	}
}