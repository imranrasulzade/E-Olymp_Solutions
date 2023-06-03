import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double cem = 0;
        int say = 0;
        for(int i = 0; i < n; i++){
            double a = sc.nextDouble();
            arr[i] = a;
        }
        for(int i = 0; i < n; i++){
          if(arr[i] < 0){
            cem += arr[i];
            say++;
          }  
        }    
        System.out.printf(say+" "+"%.2f",cem);
        
    }      
}