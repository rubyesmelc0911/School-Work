#include <iostream>
#include <stdio.h>
//o(log n) time complexity
//o(1) space complexity
using namespace std;
//hacer programas que cuenten en un array los numeros impares
//Encontrar los numeros duplicados en un array
//Contar numeros pares
//Sumar y restar los numeros de un array
//de este codigo hacer que el valor de x lo de otro algoritmo


int busquedaBinaria(int arr[], int n, int x){

    int izquierda = 0, derecha = n-1;
    int medio;
    int encontrado = 0;

    while(izquierda <= derecha){
        medio = izquierda + (derecha - izquierda) /2; //find middle of array
        

        if(arr[medio] == x){
            cout<<"Elemento"<<arr[medio]<<" encontrado"<<endl;
            encontrado = 1;
            return medio;
        }
        if (arr[medio] < x){
            izquierda = medio + 1; //go to left if the number thats being searched is less than the middle
        } else {
            derecha = medio - 1; //go to the right if the number thats being searched is higher than the middle 
        }
    }
    if(encontrado == 0){
    cout<<"Elemento no encontrado"<<endl;
    }
    return -1;
}

int main(){
    int arr[] = {[0]=10, [1]=20, [2]=30, [3]=40, [4]=56, [5]=67, [6]=70, [7]=80};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    int x = rand() % 20;
    int resultado = busquedaBinaria(arr, n, x);

    if( resultado != -1){
        cout<<"Resultado encontrado en posicion: "<<resultado<<endl;
    }else{
        cout<<"No se encontro su numero:("<<endl;
    }

}