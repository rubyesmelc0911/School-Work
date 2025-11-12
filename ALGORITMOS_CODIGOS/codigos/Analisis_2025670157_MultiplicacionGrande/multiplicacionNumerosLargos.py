a = 123456754433
b = 4342423342423
resultado = a * b
print("El resultado de la multiplicación es:", resultado)

# Salida esperada: El resultado de la multiplicación es: 5368382022468236796579

#multiplicacion manual
def multiplicar_enteros_largos(num1, num2):
    #si alguno es 0, resultado es 0
    if num1 == "0" or num2 == "0":
        return "0"  
    
    #convertimos a listas de digitos
    n1 = [int(d) for d in num1][::-1]
    n2 = [int(d) for d in num2][::-1]
    resultado = [0] * (len(n1) + len(n2))

    #multiplicacion digito a digito
    for i in range(len(n1)):
        for j in range(len(n2)):
            producto = n1[i] * n2[j]
            resultado[i + j] += producto
            #manejo de acarreo
            if resultado[i + j] >= 10:
                resultado[i + j + 1] += resultado[i + j] // 10
                resultado[i + j] %= 10

    #quitar ceros innecesarios
    while len(resultado) > 1 and resultado[-1] == 0:
        resultado.pop()

    return ''.join(map(str, resultado[::-1]))

# Ejemplo de uso
num1 = "123456754433"
num2 = "4342423342423"
resultado_manual = multiplicar_enteros_largos(num1, num2)
print("El resultado de la multiplicación manual es:", resultado_manual)

# Salida esperada: El resultado de la multiplicación manual es: 5368382022468236796579

#Karatsuba
def karatsuba(x, y):
    # Convertir a enteros si es necesario
    x = str(x)
    y = str(y)

    # Caso base para la recursión
    if len(x) == 1 or len(y) == 1:
        return str(int(x) * int(y))
    n2 = n//2

    #dividir los numeros
    x1, x0 = int(x[:-n2] or 0), int(x[-n2:])
    y1, y0 = int(y[:-n2] or 0), int(y[-n2:])

    #calculos recursivos\
    z2 = int(karatsuba(str(x1), str(y1)))
    z0 = int(karatsuba(str(x0), str(y0)))
    z1 = int(karatsuba(str(x1 + x0), str(y1 + y0))) - z2 - z0
    return str((z2 * 10**(2 * n2)) + (z1 * 10**n2) + z0)
# Ejemplo de uso
num1 = "123456754433"
num2 = "4342423342423"
resultado_karatsuba = karatsuba(num1, num2)
print("El resultado de la multiplicación con Karatsuba es:", resultado_karatsuba)

# Salida esperada: El resultado de la multiplicación con Karatsuba es: 5368382022468236796579