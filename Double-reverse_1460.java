import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b, c, d, i1 = 0, i2 = 0;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        
        for (int i = 0; i < n; i++) {
            if(i >= a - 1 && i <= b - 1){
                arr2[i] = arr[b - 1 - i1];
                i1++;
            } else{
                arr2[i] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(i >= c - 1 && i <= d - 1){
                arr3[i] = arr2[d - 1 - i2];
                i2++;
            } else{
                arr3[i] = arr2[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}