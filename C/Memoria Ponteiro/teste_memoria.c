#include <stdio.h>
#include <string.h>

void exploit_me(char *entrada){
    char buffer[10];
    strcpy(buffer,entrada);
}

int main(){
    char payload[14] = "AAAAAAAAAA";
    exploit_me(payload);
    return 0;
}
