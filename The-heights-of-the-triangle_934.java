import java.util.*;
import static java.lang.Math.*;
import static java.lang.String.*;
import java.text.DecimalFormat;

public class Main
{
public static void main(String[] args) {

double a,b,c,ha,hb,hc,p;
Scanner scan = new Scanner(System.in);
a = scan.nextDouble();
b = scan.nextDouble();
c = scan.nextDouble();
p=(a+b+c)/2;
   
ha=(2/a)*Math.sqrt(p*(p-a)*(p-b)*(p-c));    
hb=(2/b)*Math.sqrt(p*(p-a)*(p-b)*(p-c));    
hc=(2/c)*Math.sqrt(p*(p-a)*(p-b)*(p-c));
DecimalFormat dtime = new DecimalFormat("#.##"); 

System.out.printf(String.format("%.2f", ha)+" "+ String.format("%.2f", hb) +" "+ String.format("%.2f", hc));

    }
}