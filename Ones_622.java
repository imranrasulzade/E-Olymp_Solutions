import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int qaliq, b = 0, d = 0;
		int[] bin = new int[50];
		
		do{
		      qaliq = a % 2;
		      bin[b] = qaliq;
		      b++;
		      a = a / 2;
		}while(a > 0);
		
		for(int i = b-1; i >= 0;i--)
		{
		      if(bin[i] == 1) 
		      {
		            d++;
		      }
		}
		System.out.println(d);
		
	}
}