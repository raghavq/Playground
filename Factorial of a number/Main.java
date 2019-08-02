#include <stdio.h>
int main() {
	int a,i,factorial=1;
  scanf("%d",&a);
  for(i=1;i<=a;i++)
  {
    factorial = factorial * i;
  }
  printf("%d",factorial);
    
	return 0;
}