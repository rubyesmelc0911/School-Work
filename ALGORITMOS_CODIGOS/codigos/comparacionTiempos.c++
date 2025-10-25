#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdlib>
#include <ctime>

using namespace std;

//Funcion bubble sort
void bubbleSort(vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

int main(){
    int N;
    cout << "Ingrese el tamaño del arreglo: ";
    cin >> N;

    vector<int> lista_original(N);

    //Semilla aleatoria
    srand(time(0));

    //Generar lista aleatoria
    for (int i = 0; i < N; i++) {
        lista_original[i] = rand() % 10000; // Números aleatorios entre 0 y 9999
    }

    //copias de la lista original
    vector<int> lista_burbuja = lista_original;
    vector<int> lista_std = lista_original;

    //medir tiempo Bubble sort
    clock_t start_bubble = clock();
    bubbleSort(lista_burbuja);
    clock_t end_bubble = clock();

    double tiempo_bubble = double(end_bubble - start_bubble) / CLOCKS_PER_SEC;

    //medir tiempo std::sort
    clock_t start_std = clock();
    sort(lista_std.begin(), lista_std.end());
    clock_t end_std = clock();

    double tiempo_std = double(end_std - start_std) / CLOCKS_PER_SEC;

    //Mostrar resultados
    cout<<"\n Resultados---\n";
    cout<<"Tamaño del arreglo: "<<N<<endl;
    cout<<"Tiempo Bubble Sort: "<<tiempo_bubble<<" segundos"<<endl;
    cout<<"Tiempo std::sort: "<<tiempo_std<<" segundos"<<endl;

    if(tiempo_bubble < tiempo_std){
        cout<<"Bubble Sort fue más rápido."<<endl;
    } else if (tiempo_bubble > tiempo_std){
        cout<<"std::sort fue más rápido."<<endl;
    } else {
        cout<<"Ambos métodos tomaron el mismo tiempo."<<endl;
    }

    return 0;
}

//Porque std::sort es mas rapido?
//std::sort utiliza un algoritmo de ordenamiento híbrido llamado Introsort, que combina Quicksort, Heapsort y Insertion Sort.
//Este enfoque híbrido permite a std::sort adaptarse a diferentes tipos de datos y patrones
//de entrada, optimizando el rendimiento en la mayoría de los casos.

//Que complejidad tiene Bubble sort?
//La complejidad temporal de Bubble Sort es O(n^2) en el peor y promedio de los casos,
//donde n es el número de elementos en la lista. En el mejor de los casos, cuando la lista ya está ordenada,
//la complejidad es O(n) debido a la necesidad de una pasada para verificar que no se realizaron intercambios.

//Que tipo de algoritmo usa std::sort internamente?
//std::sort utiliza Introsort, que comienza con Quicksort y cambia a Heapsort si la recursión se vuelve demasiado profunda,
//y utiliza Insertion Sort para pequeñas sublistas. Este enfoque híbrido optimiza el rendimiento    
//y la eficiencia en una amplia variedad de casos.