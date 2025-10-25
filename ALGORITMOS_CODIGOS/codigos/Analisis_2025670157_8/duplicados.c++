#include <iostream>
#include <stdio.h>

//Encontrar numeros duplicados en un array 
using namespace std;

//hacer programas que cuenten en un array los numeros impares
//Encontrar los numeros duplicados en un array

int main(){
    int arr[] = {1, 2, 3, 4, 5, 3, 2, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    int contador = 0;
    cout<<"Numeros duplicados en el array: "<<endl;
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            if(arr[i] == arr[j]){
                cout<<arr[i]<<endl;
                contador++;
                break; //to avoid printing the same duplicate multiple times
            }
        }
    }
    cout<<"Total de numeros duplicados: "<<contador<<endl;
    return 0;
}

