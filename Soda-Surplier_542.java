import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int e = scanner.nextInt();
            int f = scanner.nextInt();
            int c = scanner.nextInt();
            int say = 0;
            e = e + f;
            while (c <= e)
            {
                int n = e / c;
                e = n + e % c;
                say = say + n;
            }
            System.out.println(say);
	}
}