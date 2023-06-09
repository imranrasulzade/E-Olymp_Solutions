import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int res = 0;

    int n = sc.nextInt();
    for (int i = 0; i < n; i++)
    {
      int nm = sc.nextInt();       

      double price = sc.nextDouble();

      if (price < 50.0) res += nm;

    }

    System.out.println(res);

    sc.close();

  }

}