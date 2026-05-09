#include <stdio.h>
#include <stdlib.h>

void alocar(int **a, int **b){
    int *temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
   int x = 10, y = 20;
   int *p1 = &x;
   int *p2 = &y;
   
   alocar(&p1,&p2);
    printf("%d %d\n", *p1, *p2);  // deve imprimir 20 10
}
