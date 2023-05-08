import java.util.*;

public class Main
{
public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  long a = sc.nextInt();
  long b = sc.nextInt();
  long c = sc.nextInt();
  
  long hecm, reng;
  hecm = a*b*c;
  reng = 2*a*b + 2*(a+b)*c;
  
  System.out.println(hecm+" "+(6*hecm-reng));
}
}