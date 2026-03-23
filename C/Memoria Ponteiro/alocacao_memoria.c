// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>

void leak();

int main() {
    printf("Chamando leak...\n");
        leak();
    printf("Programa Finalizado. \n");
    return 0;
}

void leak(){
    int *p = malloc(sizeof(int));
    *p=42;
    printf("Valor Alocado: %d\n",*p);
}

// Vazamento de Memoria Leaking
