#include <iostream>
using namespace std;
int largestpower(int n,int p){
int x = 0;
  while(n){
    n=n/p;
    x = x+n;
   }
return x;
}

int main() 
{
   int test_case;
  cin>>test_case;
  while(test_case--){
  int n,p;
    cin>>n>>p;
    cout<<largestpower(n,p)<<endl;
  
  }
    return 0;
}