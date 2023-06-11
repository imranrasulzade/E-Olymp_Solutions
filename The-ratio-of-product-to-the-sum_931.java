import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hasil = 1;
        int cem = 0;
        do{
            int a = n % 10;
            hasil *= a;
            cem += a;
            n /= 10;
        }while(n != 0);
    
    double h = (double)hasil;
    double c = (double)cem;
    System.out.printf("%.3f", h/c);
}
}