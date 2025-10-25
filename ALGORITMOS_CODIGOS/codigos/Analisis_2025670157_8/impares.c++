#include <iostream>
#include <stdio.h>

using namespace std;

//contar numeros impares en un array

int main(){
    int arr[] = {10, 21, 32, 43, 54, 65, 76, 87, 98};
    int n = sizeof(arr) / sizeof(arr[0]);
    int contadorImpares = 0;

    for(int i = 0; i < n; i++){
        if(arr[i] % 2 != 0){
            contadorImpares++;
        }
    }

    cout << "Cantidad de numeros impares en el array: " << contadorImpares << endl;

    return 0;
}