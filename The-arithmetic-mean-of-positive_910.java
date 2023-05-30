import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double cem = 0;
        double say = 0;
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextDouble();
        
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                cem+=arr[i];
                say++;
            }
                
        }
        if(cem > 0)
            System.out.printf("%.2f",cem/say); 
        else 
            System.out.println("Not Found");
                
    }
}