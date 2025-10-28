class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierda = None
        self.derecha = None

        #numero de hojas
def insertar(raiz, valor):
    if raiz is None:
        return Nodo(valor)
    if valor < raiz.valor:
        raiz.izquierda = insertar(raiz.izquierda, valor)
    else:
        raiz.derecha = insertar(raiz.derecha, valor)
    return raiz
def altura(raiz):
    if raiz is None:
        return 0
    else:
        altura_izquierda = altura(raiz.izquierda)
        altura_derecha = altura(raiz.derecha)
        return max(altura_izquierda, altura_derecha) + 1
def contar_nodos(raiz):
    if raiz is None:
        return 0
    else:
        return 1 + contar_nodos(raiz.izquierda) + contar_nodos(raiz.derecha)
def contar_hojas(raiz):
    if raiz is None:
        return 0
    if raiz.izquierda is None and raiz.derecha is None:
        return 1
    else:
        return contar_hojas(raiz.izquierda) + contar_hojas(raiz.derecha)
def mostrar_nivel(raiz, nivel):
    if raiz is None:
        return
    if nivel == 1:
        print(raiz.valor, end=' ')
    elif nivel > 1:
        mostrar_nivel(raiz.izquierda, nivel - 1)
        mostrar_nivel(raiz.derecha, nivel - 1)
        