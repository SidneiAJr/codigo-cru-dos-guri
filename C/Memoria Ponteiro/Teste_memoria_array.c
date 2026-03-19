#include <stdio.h>

int main() {
   int arr[5]={1,2,3,4,5};
   int *p;
   printf("--- ORDEM CRESCENTE ---\n");
   p=arr;
   for(int i=0; i<5; i++){
       printf("arr[%d]=%d\n",i,*p);
       p++;
   }
   printf("--- ORDEM Decrescente ---\n");
   p=&arr[4];
   for(int i=4; i>=0; i--){
       printf("arr[%d]=%d\n",i,*p);
       p--;
   }
   return 0;
}
