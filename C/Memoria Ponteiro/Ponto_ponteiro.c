#include <stdio.h>
#include <stdlib.h>

void alocar(int **p){
    *p = malloc(sizeof(int));
    **p = 42;
}

int main() {
   int *ptr = NULL;
   alocar(&ptr);
   printf("%d\n",*ptr);
   free(ptr);
}
