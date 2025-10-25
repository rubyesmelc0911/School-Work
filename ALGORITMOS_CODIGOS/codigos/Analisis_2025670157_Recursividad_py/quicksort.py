import time
import matplotlib.pyplot as plt

def quick_sort(arr):
    if len(arr)<=1:
        return arr #si el arreglo tiene 1 o menos elementos, ya esta "ordenado"
    #primer elemento
    pivote = arr[0]
    menores = []
    mayores = []
    for i in range(1, len(arr)):
        if arr[i] <= pivote:
            menores.append(arr[i])
        else:
            mayores.append(arr[i])
        return quick_sort(menores) + [pivote] + quick_sort(mayores)
    
arr = [5,3,7,1,4,11,12,6,20,31]
print("Arreglo original: ", arr)
arr_ordenado = quick_sort(arr)
print("Arreglo ordenado: ", arr_ordenado)

tiempos = []
tamanos = range(1, 100)

for tamano in tamanos:
    arr = list(range(tamano, 0, -1))
    inicio = time.time()
    quick_sort(arr)
    fin = time.time()
    tiempos.append(fin-inicio)

plt.plot(tamanos, tiempos)
plt.xlabel('Valor de n')
plt.ylabel('Tiempo de ejecucion del quick_sort')
plt.title('Tiempo de ejecucion de Quick Sort')
plt.grid(True)
plt.show() 

#Mejor caso
#Ocurre cuando el pivote divide al arreglo en dos subarreglos de aproximadamente
#el mismo tamano en cada llamada recursiva
#en cada nivel de recursion, el algoritmo realiza un recorrido
#completo de los elementos lo cual es On y como el numero de niveles

#O log n cuando se divide la mitad en cada paso

#peror caso ocurre cuando