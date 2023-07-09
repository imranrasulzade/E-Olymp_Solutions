import java.util.*;
import java.math.BigInteger;

class Main
{
    public static BigInteger LCM( BigInteger a , BigInteger b)
    {
        BigInteger c = a.gcd(b);
        return a.multiply(b.divide(c));
    }
    
 public static void main (String[] args) throws java.lang.Exception
 {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    BigInteger r = BigInteger.ONE;
    for(int i = 1;i <= a; i++)
    {
        BigInteger n = (BigInteger.valueOf(i));
        r = LCM(r, n);
        
    }
        System.out.print(r);
    }
}