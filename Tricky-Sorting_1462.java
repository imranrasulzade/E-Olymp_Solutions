#include <iostream>
using namespace std;
void special_selection_sort(int [], int);
void write_arr(int[], int);
int main()
{
	int n;
	cin >> n;
	int arr[n];
	for(int i = 0; i < n; i++){
		cin >> arr[i];
	}
	special_selection_sort(arr, n);
	write_arr(arr, n);
	
	return 0;
}
void special_selection_sort(int arr[], int n){
	for(int i = 0; i < n - 1; i++){
		int minimum = i;
		for(int j = i+1; j < n; j++){	
			if(arr[j] % 10 == arr[minimum] % 10)
			{		
				if(arr[j] < arr[minimum])
					minimum = j;
			}
			else
			{
				if(arr[j] % 10 < arr[minimum] % 10)
					minimum = j;	
			}
				
		}
		if(minimum != i)
			swap(arr[minimum], arr[i]);
	}
}
void write_arr(int arr[], int n){
	for(int i = 0; i < n; i++)
		cout << arr[i] << " ";
		
	cout << endl;
	
}