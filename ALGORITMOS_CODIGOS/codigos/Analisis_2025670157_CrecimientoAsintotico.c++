#include <iostream>
using namespace std;
//O(n)
int busquedaLineal(int arr[], int n, int x) { //set of elements, size of the set, element to search
    for (int i = 0; i < n; i++) {
        if (arr[i] == x) {
            return i; // Elemento encontrado, retornar el índice
        }
    }
    return -1; // Elemento no encontrado
}

//O(log n)
int busquedaBinaria(int arr[], int n, int x) { //O(log n)
    int left = 0;
    int right = n - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2; // Evitar overflow
        if (arr[mid] == x) {
            return mid; // Elemento encontrado, retornar el índice
        }
        if (arr[mid] < x) {
            left = mid + 1; // Buscar en la mitad derecha
        } else {
            right = mid - 1; // Buscar en la mitad izquierda
        }
    }
    return -1; // Elemento no encontrado
};

//Bubble sort
//O(n^2)
void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) { //avoid overflow
            if (arr[j] > arr[j + 1]) { //swap if the element found is greater than the next element
                swap(arr[j], arr[j + 1]); //swap function from the standard library
            }
        }
    }
}

int main() {
    // Example usage of linear search
    int arr[] = {2, 4, 0, 1, 9};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 1;
    int result = busquedaLineal(arr, n, x);
    if (result != -1) {
        cout << "Elemento encontrado en el índice: " << result << endl;
    } else {
        cout << "Elemento no encontrado en el arreglo" << endl;
    }

    // Example usage of binary search   
    int sortedArr[] = {0, 1, 2, 4, 9};
    int sortedN = sizeof(sortedArr) / sizeof(sortedArr[0]);
    int sortedX = 4;
    int sortedResult = busquedaBinaria(sortedArr, sortedN, sortedX);

    if (sortedResult != -1) {
        cout << "Elemento encontrado en el índice: " << sortedResult << endl;
    } else {
        cout << "Elemento no encontrado en el arreglo" << endl;
    }
    // Example usage of bubble sort
    int unsortedArr[] = {64, 34, 25, 12, 22, 11, 90};
    int unsortedN = sizeof(unsortedArr) / sizeof(unsortedArr[0]);
    bubbleSort(unsortedArr, unsortedN);
    cout << "Arreglo ordenado: ";
    for (int i = 0; i < unsortedN; i++) {
        cout << unsortedArr[i] << " ";
    }
    cout << endl;

    
    return 0;
}