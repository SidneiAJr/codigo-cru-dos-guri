#include <stdio.h>
#include <string.h>

int main(){
    int x = 42;
    int *p = &x;
    int **pp = &p;
    
    printf("x = %d\n",x);
    printf ("*p=%d\n",*p);
    printf("**pp = %d\n",**pp);
    
    return 0;
    
}
