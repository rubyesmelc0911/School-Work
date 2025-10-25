#include <iostream>
#include <stdio.h>
using namespace std;
// Estructura de control if-else
int main(){
    int edad;

    printf("Ingrese su edad: ");
    cin >> edad;
    if (edad >= 18){
        printf("Eres mayor de edad");
    } else {
        printf("Eres menor de edad");
    }
    return 0;
}