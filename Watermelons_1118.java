import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		if(n<=1){
		    System.out.println("Ooops!");
		     System.exit(0);
		}
		else{
		    Arrays.sort(a);
		    int max = a[a.length-1];
		    int min = a[0];
		    System.out.println(min +" "+max);
		}
		    
		    
	}
}