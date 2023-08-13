import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        try{
            if(n % a == 0 && n % b == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }catch(Exception e){
            System.out.println("ExceptionInInitializerError");
        }
    }
}