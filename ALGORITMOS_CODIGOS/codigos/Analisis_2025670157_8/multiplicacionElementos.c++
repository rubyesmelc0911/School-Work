#include <iostream>
#include <stdio.h>

//multiplicar los elementos de un array
using namespace std;

int main(){
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int resultado = 1;
    for(int i = 0; i < n; i++){
        resultado *= arr[i];
    }
    cout<<"El resultado de la multiplicacion es: "<<resultado<<endl;
    return 0;
}