import java.util.*;

public class Main

{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = 0;
    for (int i = 1; i < s.length(); i++)

      if ((s.charAt(i) == '+') || (s.charAt(i) == '-') ||

          (s.charAt(i) == '*')) n++;  

    System.out.println(n);

    sc.close();

  }

}