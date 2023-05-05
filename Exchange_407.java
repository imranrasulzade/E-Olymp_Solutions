import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
    int k=sc.nextInt();
    if(k%3==0)
     System.out.println("GCV");
    else
     if(k%3==1)
      System.out.println("VGC");
     else
      System.out.println("CVG");
   }
  }
}