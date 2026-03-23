#include <stdio.h>
#include <stdlib.h>

void leak();

int main() {
    printf("Chamando leak...\n");
    leak();
    printf("Programa Finalizado.\n");
    return 0;
}

void leak(){
    int *p = malloc(sizeof(int));
    if (p != NULL) {
        *p = 42;
        printf("Valor Alocado: %d\n", *p);
        free(p);   // ✅ libera a memória
        p = NULL;  // ✅ evita ponteiro pendente
    }
}
