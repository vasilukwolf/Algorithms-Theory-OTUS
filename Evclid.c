#include <stdlib.h>
#include <stdio.h>

int a = 1234567890;
int b = 12;


int main(int argc, const char *argv[]){
  while (a!=b){
      if (a > b){
          a = a - b;
        }
      else{
          b = b - a;
        }
  }
    printf("value of a: %d\n", b);
  }
