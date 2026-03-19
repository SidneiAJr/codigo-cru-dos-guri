#include <stdio.h>

int main() {
    char c = 'A';
    
    printf("Como caractere: %c\n", c);
    printf("Como número: %d\n", c);
    printf("Como hexadecimal: %x\n", c);
    
    printf("\nTabela rápida:\n");
    for(int i = 65; i <= 90; i++) {
        printf("%c = %d\n", i, i);  // 'A' a 'Z'
    }
    
    return 0;
}
