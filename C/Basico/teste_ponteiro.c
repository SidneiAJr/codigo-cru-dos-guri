#include <stdio.h>

int main() {
    int x = 10;
    int *ptr = &x;  // ptr guarda o ENDEREÇO de x
    
    printf("Valor de x: %d\n", x);
    printf("Endereço de x: %p\n", &x);
    printf("Valor de ptr: %p\n", ptr);  // ptr é o endereço
    printf("Valor APONTADO por ptr: %d\n", *ptr);  // *ptr acessa o valor
    
    *ptr = 20;  // altera x através do ponteiro
    printf("Novo valor de x: %d\n", x);
    
    return 0;
}
