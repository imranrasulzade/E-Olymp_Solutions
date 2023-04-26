import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] arr = new long[10];
		int i = 0;
		while(n!=0){
		    arr[i] = n % 10;
		    n = n / 10; 
		    i++;
            }
            int k = 1, say = 0;
            for(int j = 0; j < (i+1)/2; j++){
                if(arr[j] == arr[i-k])
                    say++;
                    
                k++;
            }
            System.out.println(say);
		}
        
	}