import java.util.*;

 

public class Main

{

  public static void main(String []args)

  {

    Scanner con = new Scanner(System.in);

    double x1 = con.nextDouble(), y1 = con.nextDouble();

    double x2 = con.nextDouble(), y2 = con.nextDouble();

    double x3 = con.nextDouble(), y3 = con.nextDouble();

 

    double a = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));

    double b = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));

    double c = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));

   

    double p = a + b + c, pp = p / 2;

    double s = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

   

    System.out.printf("%.4f %.4f\n",p,s);

    con.close();

  }

}