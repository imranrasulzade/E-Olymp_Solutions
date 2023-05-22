import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i >= 1 && i <= 3)
		    System.out.println("Initial");
		else if(i >=4 && i <= 6)
		    System.out.println("Average");
		else if(i >=7 && i <= 9)    
		    System.out.println("Sufficient");
		else if(i >=10 && i <= 12)    
		    System.out.println("High");
	}
}