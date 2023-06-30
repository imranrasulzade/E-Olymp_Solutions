#include <iostream>
#include <stack>
#include <cstring>
#include <cmath>
using namespace std;
bool isoperator(char);
int calc(int, int, char);
int main()
{
    stack <int> eded;
    string setir;
    int a, b;
    getline(cin, setir);
    for(int i = 0; i < setir.length(); i++){
        if(isdigit(setir[i]))
            eded.push(setir[i]-48);
        else if(isoperator(setir[i]))
        {
            b = eded.top();
            eded.pop();
            a = eded.top();
            eded.pop();
            eded.push(calc(a,b,setir[i]));
        }
    }
    cout << eded.top();

    return 0;
}

bool isoperator(char ch){
    if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
        return true;
    else
        return false;
}

int calc(int a, int b, char ch){
    switch(ch){
        case '+':{
            return a + b;
            break;
        }
        case '-':{
            return a - b;
            break;
        } 
        case '*':{
            return a * b;
            break;
        }
        case '/':{
            return a / b;
            break;
        }
        case '^':{
            return pow(a,b);
            break;
        }
    }
}