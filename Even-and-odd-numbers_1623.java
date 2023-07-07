import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        if(n % 2 == 0 && m % 2 == 0 && l % 2 == 0)
            System.out.println("NO");
        else if(n % 2 != 0 && m % 2 != 0 && l % 2 != 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}