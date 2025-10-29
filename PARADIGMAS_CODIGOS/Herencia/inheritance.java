package PARADIGMAS_CODIGOS.Herencia;
import PARADIGMAS_CODIGOS.Herencia.claseHijaSumar.sumar;
import PARADIGMAS_CODIGOS.Herencia.claseHijaResta.resta;

public class inheritance {
    public static void main(String[] args) {
        sumar suma = new sumar();
        resta resta = new resta();

        System.out.println("Operación de Suma:");
        suma.getDatos();
        suma.operarSuma();
        suma.mostrarResultado();

        System.out.println("\nOperación de Resta:");
        resta.getDatos();
        resta.operarResta();
        resta.mostrarResultado();
    }
}
