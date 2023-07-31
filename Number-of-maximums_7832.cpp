#include <iostream>

using namespace std;

int main() {
	int n, a[101], d = -100;
	cin >> n;
	for (int i = 0; i < n; ++i)
	{
		cin >> a[i];
		if (a[i]> d)
		d =  a[i];
		   
	}
	int m = 0;
	for(int i = 0;i < n;i++)
	{
	    if(a[i] == d)
	    m++;
	}
	 cout <<  m;
	return 0;
}