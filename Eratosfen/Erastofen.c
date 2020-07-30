#include <stdlib.h>
#include <stdio.h>

int n = 100;


int main(){
 int a[]={};
  for (int i = 0; i < n + 1; i++)
    a[i] = i;
  for (int p = 2; p < n + 1; p++)
  {
    if (a[p] != 0)
    {
      printf( "%d\n", a[p]);
      for (int j = p*p; j < n + 1; j += p){
        a[j] = 0;
      }
    }
  }
}
