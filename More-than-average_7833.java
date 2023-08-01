import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  double orta = 0;
	  int cem = 0, k = 0;
	  int yeni = 0;
	  int []arr = new int[n];
	  
	  for(int i = 0; i < n; i++)
	  {
	      arr[i] = sc.nextInt();
	  }
	  for(int i = 0; i < n; i++)
	  {
	      cem = cem + arr[i];
	  }
	  for(int i = 0; i < n; i++)
	  {
	      if(arr[i] > (double)cem/n)
	       {
	            yeni = yeni + arr[i];
	            k++;
	       }
	 } 
	 System.out.println(yeni+" "+k);
	}
}