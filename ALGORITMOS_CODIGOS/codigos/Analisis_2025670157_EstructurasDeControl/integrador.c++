#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
    int contadorPar, sumaPar, sumaImpar, contadorImpar;

    //hacer un programa que sume los numeros pares y los numeros impares
    for (int i=1; i <=5; i++){
        if(i%2==0){
            sumaPar += i;
            contadorPar++;

        }else{
            sumaImpar += i;
            contadorImpar++;
        }
    }

    printf("La suma de los pares es: ", sumaPar, " El contador es: ", contadorPar);
    printf("La suma de los impares es: ", sumaImpar, " El contador es: ", contadorImpar);
    
}