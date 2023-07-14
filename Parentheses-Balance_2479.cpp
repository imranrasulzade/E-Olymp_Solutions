#include<iostream>
#include<stack>
using namespace std;
bool acilan_moterize(char);
bool baglanan_moterize(char);
bool yoxla(char, char);
int main()
{
      int r;
      cin >> r>>ws;
	for(int l = 0;l < r;l++)
	{
	      string st;
	stack<char> s;
	bool shert = true;
	getline(cin, st);
	//cin >> st;
	for(int i = 0; i < st.length(); i++)
	{
		if(acilan_moterize(st[i]))
		 s.push(st[i]);
		else{
		      if(s.empty())
		      {
		            shert = false;
		            break;
		      }
		      else if(baglanan_moterize(st[i]))
		      {
		        
		  	if(yoxla(s.top(),st[i]))
		  	 s.pop();
		  	 else
		  	  {
		  	  	shert = false;
		  	  	break;
		  	  }
		  }
	}
	}
 if(shert && s.empty()) cout <<"Yes\n";
 else cout <<"No\n";
	
	 shert = true;     
	}
	
return 0;
}
bool acilan_moterize(char ch)
{
	if(ch == '(') return true;
	if(ch == '{') return true;
	if(ch == '[') return true;
	return false;
}
bool baglanan_moterize(char ch)
{
	if(ch == ')') return true;
	if(ch == '}') return true;
	if(ch == ']') return true;
	return false;	
}
bool yoxla(char a, char b)
{
	if(a =='(' && b == ')') return true;
	if(a =='[' && b == ']') return true;
	if(a =='{' && b == '}') return true;
	return false;
}