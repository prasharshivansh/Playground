#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n ; 
  cin>>n;
  string name;
  map<string , int> m ;
  while(n--){
  cin>>name;
    m[name]++;
  }
  map<string , int>::iterator itr;
  for(itr = m.begin();itr!=m.end();itr++){
  
  cout<<itr->first<<" "<<itr->second<<endl;
  }
    return 0;
}