import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, x, y;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(a <= x && b <= y || a <= y && b <= x){
            System.out.println("YES");
        } else if(a <= x && c <= y || a <= y && c <= x){
            System.out.println("YES");
        } else if(b <= x && c <= y || b <= y && c <= x){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }       
    }
}