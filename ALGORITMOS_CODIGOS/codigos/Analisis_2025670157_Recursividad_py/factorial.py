import time
import matplotlib.pyplot as plt

#calcular factorial haciendo uso de la recursion
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n-1)
numero = 5
resultado = factorial(numero)
print(f"El factorial de {numero} es: {resultado}")

tiempos = []
valores_n = range(1, 21)

#hacer un calculo de distintos factoriales hasta llegar a un cierto numero
for n in valores_n:
    inicio = time.time()
    resultado = factorial(n)
    fin = time.time()
    tiempos.append(fin-inicio) #ir agregadndo los tiempos que va tomando para resolver cada numero
plt.plot(valores_n, tiempos)
plt.xlabel('Valor de n')
plt.ylabel('Tiempo de ejecucion del factorial recursivo')
plt.title('Tiempo de ejecucion del factorial recursivo')
plt.grid(True)
plt.show() 

#la complejidad del algoritmo para calcular el factorial de un numero
#dde manera recursiva es O(n)
#ya que la funcion realiza una llamada recursiva para ada valor de n hasta llegar al 
#caso base, cada llamada recursiva toma un tiempo constante,
#por lo que el numero total de llamadas es directamente proporcional a n