#include <stdio.h>

int main() {
   char *str = "salve gurizada";
   printf("String Inteira: %s\n",str);
   printf("String Inteira: %c\n",str);
   printf("String Inteira: %c\n",(str+1));
   return 0;
   
}

#include <stdio.h>

int main() {
   char *str = "october";
   char *p = str;
   printf("Percorrendo---\n");
   while(*p != '\0'){
       printf("Caractere: %c (código: %d)\n", *p, *p);
       p++;  // anda pro próximo char (1 byte)
   }
   return 0;
   
}
