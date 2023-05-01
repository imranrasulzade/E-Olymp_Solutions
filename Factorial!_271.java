import java.math.BigInteger;
import java.util.Scanner;
  
public class Main
{
    static BigInteger factorial(int a)
    {
        BigInteger f = new BigInteger("1"); 
  
        
        for (int i = 2; i <= a; i++)
            f = f.multiply(BigInteger.valueOf(i));
  
        return f;
    }
  
    
    public static void main(String args[]) throws Exception
    {
       Scanner scan = new Scanner(System.in);
               int N;
        N = scan.nextInt();
        System.out.println(factorial(N));
    }
}