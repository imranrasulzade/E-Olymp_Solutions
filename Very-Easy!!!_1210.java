import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	long ans = 0, s;
	
	long n = sc.nextLong();
	long a = sc.nextLong();
	
	s = a;
	if (a == 1)
	System.out.println(n * (n + 1) / 2);
	else
	{
		for (long i = 1; i <= n; i++)
		{
			ans += i * s;
			s *= a;
		}
		System.out.println(ans);
	}
}
}