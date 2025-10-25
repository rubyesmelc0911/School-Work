#include <stdio.h>
#include <iostream>
using namespace std;
//secuencial if else
int main(){
    int numero;
    printf("Ingrese un numero: ");
    cin >> numero;

    if(numero%2 == 0){
        printf("El numero es par");
    } else {
        printf("El numero es impar");
    }
    return 0;
}