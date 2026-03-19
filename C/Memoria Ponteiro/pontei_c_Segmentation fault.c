#include <stdio.h>
#include <string.h>

void vul(char *dado){
    char buffer[10];
    strcpy(buffer,dado);
    printf("Buffer: %s\n",buffer);
}

int main() {
   char normal[]= "tranquilo";
   char ataque[]= "AAAAAAAAAAAAAAAAAAAAAA";
   printf("----- Teste OK------\n");
   vul(normal);
   printf("----- Teste Estouro------\n");
   vul(ataque);
   
   return 0;
}

//Saida Esperada:
/*
----- Teste OK------
Buffer: tranquilo
----- Teste Estouro------
Buffer: AAAAAAAAAAAAAAAAAAAAAA
Segmentation fault

*/
