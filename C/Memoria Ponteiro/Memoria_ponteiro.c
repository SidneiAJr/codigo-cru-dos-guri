#include <stdio.h>

int main() {
    int a = 10;
    int *ptr;
    printf("--- ANTES DE ATRIBUIR ---\n");
    printf("Valor de X:\n",a);
    printf("Endereço de x: %p\n", &a);
    ptr = &a;
     printf("Tamanho de x: %lu bytes\n", sizeof(a));
    printf("Tamanho de ptr: %lu bytes\n", sizeof(ptr));
     printf("\n--- DEPOIS DE ATRIBUIR ---\n");
    printf("Conteúdo de ptr (ENDERECO DE X): %p\n", ptr);
    printf("Valor APONTADO por ptr: %d\n", *ptr);  // *ptr == x
    *ptr = 99;  // altera o valor no endereço apontado
}
