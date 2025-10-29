package PARADIGMAS_CODIGOS.Herencia.claseHijaSumar;
import PARADIGMAS_CODIGOS.Herencia.operations;

public class sumar extends operations {
    public void operarSuma(){
        resultado = numero1 + numero2; //has to be inside a method to work
        //and the attributes are inherited just by extending the class
    }
}
