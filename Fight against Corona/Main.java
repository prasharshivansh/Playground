#include <bits/stdc++.h>
using namespace std;
int get_palindrome(string str){
int hh,mm;
  hh = (str[0]-48)*10+(str[1]-48);
  mm = (str[3]-48)*10+(str[4]-48);
  int required_time = 0;
  while(hh%10!=mm/10 || hh/10!=mm%10){
  ++mm;
    if(mm==60){
    mm = 0;
      ++hh;
    }
    if(hh == 24)
      hh = 0;
    ++required_time;
  
  }
return required_time;
}
int main() 
{
   string str;
  getline(cin,str);
  cout<<get_palindrome(str)<<endl;
return 0;
}