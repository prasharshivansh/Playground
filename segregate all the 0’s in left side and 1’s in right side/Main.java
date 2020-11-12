#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
  int n;
  cin>>n;
  int a[n];
 for(int i = 0;i < n;i++ ){
 cin>>a[i];
 }
  int count=0;
  for(int i = 0;i < n;i++ ){
  if(a[i]==0){
    count++;
    }
  }
   for( int i = 0;i < count;i++ ){
   a[i]=0;
   }
 for( int i = count;i < n;i++ ){
   a[i]=1;
 }  
 for(int i = 0;i < n;i++ ){
 cout<<a[i];
 }
  
   
    return 0;
}