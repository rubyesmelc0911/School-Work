#include <stdio.h>
#include <iostream>
//Secuencial de switch

using namespace std;

int main(){
    int opcion;
    printf("1.- Sumar\n  2.-Restar\n  3.-Salir\n");
    printf("Ingrese una opcion: ");
    cin >> opcion;
    switch(opcion){
        case 1:
            printf("Has seleccionado sumar\n");
            break;
        case 2:
            printf("Has seleccionado restar\n");
            break;
        case 3:
            printf("Saliendo del programa\n");
            break;
        default:
            printf("Opcion no valida\n");
    }
    return 0;
}