import java.util.*;
public class Main{
  public static void main(String[] args){  
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    try{
        if(a % b == 0)
            System.out.println("Divisible");
        else
            System.out.println(a/b+" "+a%b);
    }catch(Exception e){
        System.out.println("ExceptionInInitializerError");
    }
      
  }

    
}