import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        long n = sc.nextLong();

        do{
            long a = n % 10;
            System.out.print(a);
            n = n / 10;
        }while(n > 0);
}
}