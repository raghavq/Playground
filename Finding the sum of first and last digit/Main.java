#include <stdio.h>
int main() {
	int n,temp, last_digit;
  scanf("%d",&n);
  last_digit = n % 10;
  while(n/10>0)
  {
    temp = n % 10;
    n = n/10 ;
    
  }
  printf("%d",last_digit + n);
    
	return 0;
}