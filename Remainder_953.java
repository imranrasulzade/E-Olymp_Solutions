import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int son = n % 10;
        int ilk = n / 100 % 10;
        try{
            System.out.println(son % ilk);
        }catch(Exception e){
            System.out.println("ExceptionInInitializerError");
        }
    }
}