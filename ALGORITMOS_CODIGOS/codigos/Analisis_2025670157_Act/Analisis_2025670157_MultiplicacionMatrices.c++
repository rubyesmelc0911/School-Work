#include <stdio.h>

#define MAX 10 

int main(){
    int n;
    int A[MAX][MAX], B[MAX][MAX], C[MAX][MAX];
    printf("Ingrese el tamaño de la matriz (n x n): ");
    scanf("%d", &n);

    if(n > MAX){
        printf("Excede el limite de tamaño %d\n", MAX);
        return 1;
    }

    printf("Ingrese los elementos de la matriz A:\n");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("A[%d][%d]: ", i, j);
            scanf("%d", &A[i][j]);
        }
    }

    printf("Ingrese los elementos de la matriz B:\n");
    for(int i = 0; i < n; i++){ 
        for(int j = 0; j < n; j++){
            printf("B[%d][%d]: ", i, j);
            scanf("%d", &B[i][j]);
        }
    }

    // Inicializar matriz C a cero
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            C[i][j] = 0;
        }
    }

    // Multiplicación de matrices
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            for(int k = 0; k < n; k++){
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    printf("Resultado de la multiplicación de matrices C = A * B:\n");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("%d ", C[i][j]);
        }
        printf("\n");
    }
    return 0;
}