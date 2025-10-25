#include <iostream>
#include <stdio.h>
using namespace std;

//sumar los numeros de un array
int main(){
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int suma = 0;
    int resta = 0;
    for(int i = 0; i < n; i++){
        suma += arr[i];
        resta -= arr[i];
    }
    cout<<"El resultado de la suma es: "<<suma<<endl;
    cout<<"El resultado de la resta es: "<<resta<<endl;
    return 0;
}