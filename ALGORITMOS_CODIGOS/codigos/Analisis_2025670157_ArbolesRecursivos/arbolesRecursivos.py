#clase para representar un nodo del arbol
class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierda = None
        self.derecha = None
#funcion para insertar valores en el arbol
def insertar(raiz, valor):
    if raiz is None:
        return Nodo(valor)
    if valor < raiz.valor:
        raiz.izquierda = insertar(raiz.izquierda, valor)
    else:
        raiz.derecha = insertar(raiz.derecha, valor)
    return raiz
#Recorrido en preorden (raiz, izquierda, derecha)
def preorden(raiz):
    if raiz:
        print(raiz.valor, end=' ')
        preorden(raiz.izquierda)
        preorden(raiz.derecha)

#Recorrido en inorden ( izquierda, raiz, derecha)
def inorden(raiz):
    if raiz:
        inorden(raiz.izquierda)
        print(raiz.valor, end=' ')
        inorden(raiz.derecha)
#Recorrido en postorden (izquierda, derecha, raiz)
def postorden(raiz):
    if raiz:
        postorden(raiz.izquierda)
        postorden(raiz.derecha)
        print(raiz.valor, end=' ')  
#Programa principal
def main():
    print("Arbol Binario y Recorridos Recursivos")
    datos = [50, 30, 20, 40, 70, 60, 80]
    raiz = None
    for valor in datos:
        raiz = insertar(raiz, valor)

    print("Recorrido en Preorden:")
    preorden(raiz)
    print("\nRecorrido en Inorden:")
    inorden(raiz)
    print("\nRecorrido en Postorden:")
    postorden(raiz)
if __name__ == "__main__":
    main()