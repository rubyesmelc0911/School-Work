#include <iostream>
#include <stdio.h>

//contar los numeros pares en un array

int main(){
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int n = sizeof(arr) / sizeof(arr[0]);
    int contador = 0;
    for(int i = 0; i < n; i++){
        if(arr[i] % 2 == 0){
            contador++;
        }
    }
    std::cout<<"El numero de elementos pares en el array es: "<<contador<<std::endl;
    return 0;
}