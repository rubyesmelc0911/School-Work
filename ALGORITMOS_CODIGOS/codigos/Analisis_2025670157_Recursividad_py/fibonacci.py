import time
import matplotlib.pyplot as plt

def fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)


n = 10
resultado = fibonacci(n)
print(f"El {n} numero de fibonacci es: {resultado}")

tiempos = []
valores_n = range(1, 21)

#hacer un calculo de distintos factoriales hasta llegar a un cierto numero
for n in valores_n:
    inicio = time.time()
    resultado = fibonacci(n)
    fin = time.time()
    tiempos.append(fin-inicio) #ir agregadndo los tiempos que va tomando para resolver cada numero
plt.plot(valores_n, tiempos)
plt.xlabel('Valor de n')
plt.ylabel('Tiempo de ejecucion del fibonacci recursivo')
plt.title('Tiempo de ejecucion del fibonacci recursivo')
plt.grid(True)
plt.show() 

#cada llamada a la funcion genera dos llamadas recursivas adicionales, 
#una para F(n-1) y otra para F(n-2)
#como resultado, el numero total de llamadas recursivas se duplica a medida que n aumenta
#y esto da lugar a un crecimiento exponencial en el numero de operaciones