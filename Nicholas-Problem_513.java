import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long sum = 1;
		
		if(n >= m)
		    System.out.println(0);
		else{
		    while(n > 0){
		    sum = ((n % m) * (sum % m)) % m;
		    n -= 1;
		}
		System.out.println(sum);
		}
		
	}
}