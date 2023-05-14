import java.util.*;
public class Main
{
public static void main(String[] args){
Scanner sc=new Scanner (System.in);

String ip1=sc.next();
String ip2=sc.next();
String[] eded1 = ip1.split("\\:");
String[] eded2 = ip2.split("\\:");
int a1 = Integer.parseInt(eded1[0]);
int b1 = Integer.parseInt(eded1[1]);
int c1 = Integer.parseInt(eded1[2]);
int a2 = Integer.parseInt(eded2[0]);
int b2 = Integer.parseInt(eded2[1]);
int c2 = Integer.parseInt(eded2[2]);

int x = a1*3600+b1*60+c1;
if(a2<a1) a2+=24;
int y = a2*3600+b2*60+c2;
int v = y-x;
int s=v/3600;
v=v%3600;
int d = v/60;
v=v%60;
if(s>=0 && s<=9)
    System.out.print("0"+s+":");
else
    System.out.print(s+":");
if(d>=0&& d<=9)
    System.out.print("0"+d+":");
else
    System.out.print(d+":");
if(v>=0 && v<=9)
    System.out.println("0"+v);
else
    System.out.println(v);

sc.close();
}
}