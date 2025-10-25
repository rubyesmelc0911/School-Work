#include <stdio.h>
#include <iostream>
using namespace std;

//funcion para ordenar un arreglo usando burbuja
void burbuja(int arr[], int n){
int i, j, temp; \
    int comparaciones =0;
    int intercambios = 0;

    //imprimir el arreglo original
    cout<<"Arreglo original: ";
    for(i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }

    //recorrer los elementos del arreglo
    for(i=0;i<n;i++){
        for(j=0;j<n-i-1;j++){
            comparaciones++;
            if(arr[j] > arr[j+1]){
                //intercambiar los elementos si estan en el orden incorrecto
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                intercambios++;
            }
        }
    }

    //imprimir el arreglo ordenado
    cout<<"\nArreglo ordenado: ";
    for(i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    cout<<"Comparaciones: "<<comparaciones<<endl;
    cout<<"Intercambios: "<<intercambios<<endl;
}

int main(){
    int arr[] = {11,12,13,15,17};
    int n = sizeof(arr)/sizeof(arr[0]);
    burbuja(arr, n);

    return 0;
}