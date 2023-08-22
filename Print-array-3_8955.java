import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n, i;
		int musbet = 0, menfi = 0;
		Scanner sc = new Scanner(System.in);
	 
		n = sc.nextInt();	
		int [] a = new int[n];
	
		for (i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}  
		for(i = 0; i < n; i++)
		{
			if(a[i] > 0)
			{
				musbet++;
			}
		
		}
		if(musbet==0){
		System.out.print("NO");
		}
		else if(musbet>0){ 
		    System.out.println(musbet); 
		}
		for(i = 0; i < n; i++)
		{
			if(a[i] > 0)
			{
				System.out.print(a[i]+ " ");
			}
		
		
		}
		
	}
}