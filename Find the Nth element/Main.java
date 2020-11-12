#include <iostream>
using namespace std;
struct Node{
int data;
  struct Node *next;
};
struct Node *head = NULL;
void insert(int data){
Node *newnode = new Node;
  
  
  newnode->data = data;
  newnode->next = NULL;
  if(head==NULL){
    head = newnode;
  }
  else{
   Node *curr = head;
  while(curr->next!=NULL){
  curr = curr->next;
  }
  curr->next = newnode;
  }
}
int findNth(int n){
  if(head==NULL){
  return -1;
  }
Node *curr = head;
  int count = 1;
  while(curr!=NULL&&count<n){
  curr=curr->next;
    count++;
  }
  if(curr==NULL){
  return -1;
  }
  else{
  return curr->data;
  }
}
int main() 
{
int n,find;
  cin>>n;
  for(int i = 0;i<n;i++){
  int data;
    cin>>data;
    insert(data);
  }
 
  cin>>find;
  int result = findNth(find);
  if(result != -1)
  cout<<result;
  else
    cout<<"No node found";
}