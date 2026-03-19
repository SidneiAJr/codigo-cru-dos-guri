#include <stdio.h>

void funcao(){
    int local = 42;
    printf("Endereço de 'local' na pilha: %p\n",&local);
}

int main(){
    funcao();
    return 0;
}
