import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a >= 0){
                a = a+2;
            }
        arr[i] = a;
        }
        
        for(int i = 0; i < n-1; i++){
            System.out.print(arr[i]+" ");
        }
           System.out.print(arr[n-1]); 
    }      
}