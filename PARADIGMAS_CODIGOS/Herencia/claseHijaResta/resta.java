package PARADIGMAS_CODIGOS.Herencia.claseHijaResta;
import PARADIGMAS_CODIGOS.Herencia.operations;

public class resta extends operations {
    public void operarResta(){
        resultado = numero1 - numero2; //extends gives the attributes to the child class
    }
}