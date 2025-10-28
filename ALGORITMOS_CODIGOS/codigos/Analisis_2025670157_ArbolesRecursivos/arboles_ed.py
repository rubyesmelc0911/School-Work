class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierda = None
        self.derecha = None

# función para insertar valores en el árbol
def insertar(raiz, valor):
    if raiz is None:
        return Nodo(valor)
    if valor < raiz.valor:
        raiz.izquierda = insertar(raiz.izquierda, valor)
    else:
        raiz.derecha = insertar(raiz.derecha, valor)
    return raiz

def imprimir_arbol(raiz, nivel=0, lado="R"):
    if raiz is not None:
        imprimir_arbol(raiz.derecha, nivel + 1, "Derecha")
        print("   " * nivel + f"({lado})--> {raiz.valor}")
        imprimir_arbol(raiz.izquierda, nivel + 1, "Izquierda")

def main():
    raiz = None
    valores = [50, 30, 70, 20, 40, 60, 80, 48, 98, 1, 23]
    # insertar valores
    for valor in valores:
        raiz = insertar(raiz, valor)
    
    imprimir_arbol(raiz)

if __name__ == "__main__":
    main()
