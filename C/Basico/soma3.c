#include <stdio.h>

double soma(double n1,double n2);
int soma2(int n3, int n4);


int main() {
    soma(5.5,5.5);
    soma2(5,5);
    
}

double soma(double n1,double n2){
    double soma = n1+n2;
    printf("%f\n",soma);
    return soma;
}

int soma2(int n3, int n4){
    int soma2 = n3 +n4;
    printf("%f\n",soma2);
    return soma2;
}


