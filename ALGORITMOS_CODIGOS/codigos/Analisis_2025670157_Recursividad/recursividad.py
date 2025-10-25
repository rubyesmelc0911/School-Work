import time
import matplotlib.pyplot as plt

def MergeSort(lista):
    if len(lista) <= 1:
        return lista
    mitad = len(lista) //2
    derecha = lista[:mitad]
    izquierda = lista[mitad:]
    return Juntar(derecha, izquierda)

def Juntar(derecha, izquierda):
    arreglo_ordenado = []
    size_izquierda = 0 
    size_derecha = 0

    while size_izquierda < len(izquierda) and size_derecha < len(derecha):
        valor_izquierda = izquierda[size_izquierda]
        valor_derecha = derecha[size_derecha]
        if valor_izquierda <= valor_derecha:
            arreglo_ordenado.append(valor_izquierda)
        else:
            arreglo_ordenado.append(valor_derecha)
            size_derecha += 1
    while size_izquierda < len(izquierda):
        arreglo_ordenado.append(izquierda[size_izquierda])
        size_izquierda += 1
    while size_derecha > len(derecha):
        arreglo_ordenado.append(derecha[size_derecha])
        size_derecha += 1
        return arreglo_ordenado
    

    #datos prueba
    import random 
    tamanios = [10,50,100,500, 1000, 5000, 10000]
    tiempos = []

    for tamanio in tamanios:
        lista = [random.randint(0,10000) for _ in range(tamanio)]
        inicio = time.time()
        MergeSort(lista)
        fin = time.time()
        tiempos.append(fin - inicio)
    plt.plot(tamanios, tiempos)
    plt.title("Tiempo de ejecucion de MergeSort")
    plt.xlabel("Tamanio de la lista:")
    plt.ylabel("Tiempo(segundos)")
    plt.grid()
    plt.legend()
    plt.show()

    arreglo = [5,3,7,1,4,11,12,6,20,31]
    print(f"Arreglo original: {arreglo}")
    arreglo_ordenado = MergeSort(arreglo)
    print(f"Arreglo ordenado: {arreglo_ordenado}")

    #MergeSort sigue el paradigma de divide y venceras divide la lista en dos mitades hasta llegar a listas de tamanio 1, lo cual implica log n
    #niveles de recursion, en cada nivel se realizan O(n) operaciones para combinar las dos mitades usando la funcion Juntar
    #Complejidad total es O(nlogn)
