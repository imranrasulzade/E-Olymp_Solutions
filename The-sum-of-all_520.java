import java.util.*;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        while(sc.hasNextInt())
            sum += sc.nextInt();
            
        System.out.println(sum);
    }
}