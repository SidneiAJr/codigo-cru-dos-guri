#include <stdio.h>
#include <string.h>

void vul(char *dado){
    char buffer[10];
    strcpy(buffer,dado);
    printf("Buffer em: %p\n",buffer);
}

int main() {
   char payload[] = "AAAAAAAAAAbBBB";
   vul(payload);
   return 0;
}
