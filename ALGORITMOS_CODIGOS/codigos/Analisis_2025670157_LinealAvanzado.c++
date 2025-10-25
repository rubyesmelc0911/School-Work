#include <stdio.h>

int busquedaLineal(int arr[], int n, int x){
    for(int i=0;i<n;i++){
        if(arr[i] == x){
            return i;
        }
    }

}

int main(){
    int arr[] = {[0]=15, [1]=20, [2]=30, [3]=40, [4]=50};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 30;

    int resultado = busquedaLineal(arr, n, x);
    if(resultado != -1){
        printf("Elemento encontrado en la posicion %d", resultado);
    
    }
    else {printf("Elemento no encontrado");}
            
}