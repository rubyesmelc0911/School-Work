package PARADIGMAS_CODIGOS.Herencia;
import java.util.Scanner;

public class operations {
    protected int numero1, numero2, resultado;
    Scanner dato = new Scanner(System.in);
    
    public void getDatos(){
        System.out.println("Ingrese el primer numero: ");
        numero1 = dato.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = dato.nextInt();
    }

    public void mostrarResultado(){
        System.out.println("El resultado es: " + resultado);
    }

    
}
