import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int k = sc.nextInt();
	      int w = sc.nextInt();
	      int a1 = sc.nextInt();
	      int b1 = sc.nextInt();
	      int a2 = sc.nextInt();
	      int b2 = sc.nextInt();
	      int a3 = sc.nextInt();
	      int b3 = sc.nextInt();
		
		if(a1 <= w && b1 >= k)
		      System.out.println("YES");
		else if(a2 <= w && b2 >= k)
		      System.out.println("YES");
		else if(a3 <= w && b3 >= k)
		      System.out.println("YES");
		else if((a1 + a2) <= w && (b1 + b2) >= k)
		      System.out.println("YES");
		else if((a1 + a3) <= w && (b1 + b3) >= k)
		      System.out.println("YES");
		else if((a2 + a3) <= w && (b2 + b3) >= k)
		      System.out.println("YES");
		else if((a1 + a2 + a3) <= w && (b1 + b2 + b3) >= k)
		      System.out.println("YES");
		else
		      System.out.println("NO");
	}
}