import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] herf = new int[n];
    for(int i = 0; i < n; i++){
        herf[i] = sc.nextInt();
    }
    
    int m = sc.nextInt();
    int[] vurus = new int[m];
    for(int i = 0; i < m; i++){
        vurus[i] = sc.nextInt();
    }
    
    for(int j = 1; j <= n; j++){
        int count = 0;
        for(int i = 0; i < m; i++){
            if(vurus[i] == j)
                count++;
        }
        if(count > herf[j-1])
            System.out.println("yes");
            
        else
           System.out.println("no");
    }
  }
}