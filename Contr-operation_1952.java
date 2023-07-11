 import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int max = 0;
		for(int i = 0;i < n;i++){
		    arr[i] = sc.nextInt();
		}
		for(int j = 0;j < n;j++)
		{
		    if(arr[j] > max)
		    max = arr[j];
		}
		int min = arr[0];
		for(int k = 0;k < n;k++)
		{
		    if(arr[k] <= min)
		    min = arr[k];
		}
		for(int l = 0; l < n;l++)
		{
		    if(arr[l] == max)
		    arr[l] = min;
		}
		for(int t = 0;t < n;t++)
		{
		    System.out.print(arr[t] + " ");
		}
	}
}