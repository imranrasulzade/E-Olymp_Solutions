import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      int t1, t2, t3;
	  
	      Scanner sc = new Scanner(System.in);
            t1 = sc.nextInt();
            t2 = sc.nextInt();
            t3 = sc.nextInt();
            
            if(t1 < t2 && t1 < t3)
		      System.out.println(t1);
		else if(t2 < t1 && t2 < t3)
		      System.out.println(t2);
		else if(t3 < t1 && t3 < t2)
		      System.out.println(t3);
	}
}