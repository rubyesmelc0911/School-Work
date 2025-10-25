#include <stdio.h>
#include <iostream>
 //definir el maxino de la matrix
//Complejidad O(n^2)

using namespace std;

int main(){
    int n, resultado = 1;
    int tope = 10;
    
    cout<<"Ingrese el tamano de la matriz:"<<endl;
    cin>>n;

    if(n < 1 || n > tope){
        cout<<"Error, el tamano de la matriz debe ser entre 1 y "<<tope<<endl;
    }else{
        int A[n][n]; //crear matriz n x n

        //llenar la matriz con valores desde el usuario
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                cout<<"Ingrese el valor para la posicion A["<<i<<"]["<<j<<"]:"<<endl;
                cin>>A[i][j];
            }
        }

        //multiplicar los elementos de la matriz
        for(int i = 0; i < n; i++){
            //recorrer las filas
            for(int j = 0; j < n; j++){
                //recorrer las columnas
                resultado = A[i][j] * resultado;
            }
        }
        cout<<"El resultado de la multiplicacion de los elementos de la matriz es:"<<resultado<<endl;
    }

}

