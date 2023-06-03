import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int say = 0;
        double cem = 0;
        double[] arr = new double[a];
        for(int i = 0; i < a; i++)
            {
                arr[i] = sc.nextDouble();
            }
        for(int i = 1; i < a; i++)    
        {
            if(arr[i-1] > 0 && i % 3 == 0)
               {
                    say++;
                    cem += arr[i-1];
               }
        }
        System.out.printf(say+" "+"%.2f", cem);
        }
    }