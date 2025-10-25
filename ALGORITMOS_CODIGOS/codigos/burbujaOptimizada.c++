#include <iostream>
#include <stdio.h>

using namespace std;

void burbujaOptimizada(int arr[], int n){
    int i,j,temp;
    int comparaciones=0;
    int intercambios=0;
    int bandera;

    //imprimir arreglo original
    cout<<"Arreglo original: "; 
    for(i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }

    for(i =0; i<n-1; i++){
        bandera = 0;
        for(j=0;j<n-i-1;j++){
            comparaciones++;
            if(arr[j] > arr[j+1]){
                //intercambiar los elementos si estan en el orden incorrecto
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                intercambios++;
                bandera = 1;
            }
        }
        if(bandera == 0){
            break;
        }
    }

    //imprimir arreglo ordenado
    cout<<"\nArreglo ordenado: ";   
    for(i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }

    cout<<"Intercambios: "<<intercambios<<endl;
    cout<<"Comparaciones"<<comparaciones<<endl;
}

int main(){
    int arr[] = {13,16,34,56,78};
    int n = sizeof(arr) / sizeof(arr[0]);

    burbujaOptimizada(arr,n);

}