import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        int d = n / 1000 % 10;
        try{
            if(n % a == 0 && n % b == 0 && n % c == 0 && n % d == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }catch(Exception e){
            System.out.println("NO");
        }
    }
}