import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = 0;
        if(a % 2 == 0){
            for(long i = a+1; i <= b; i+=2)
                sum += i;
        }
        else
            for(long i = a; i <= b; i+=2)
                sum += i;
                
        System.out.println(sum);
    }
}