#include <iostream>

using namespace std;

int main()
{
    int n, d = 0;
    cin >> n;
    int A[n][n];
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cin >> A[i][j];
        }
    }
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(A[i][j] == 1)
                d++;
        }
    }
    cout << d;

    return 0;
}