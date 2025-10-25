#include <stdio.h>
#include <iostream>
using namespace std;
//do while structure
int main(){
    int numero;
    do{
        printf("Ingrese un numero positivo: ");
        cin >> numero;
    }while(numero <= 0);
    printf("El numero ingresado es: %d", numero);
    return 0;
    
}