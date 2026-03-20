#include <stdio.h>
#include <string.h>

void vul(char *dado){
    char buffer[10];
    strcpy(buffer,dado);
}

int main() {
   char payload[] = "AAAAAAAAAAbBBBFFFFFFF";
   vul(payload);
   return 0;
}
