package PolimorfismoFigura;

public class triangulo extends figura{
    private double altura;
    private double ancho;

    //constructor
    public triangulo(double altura, double ancho){
        this.altura = altura;
        this.ancho = ancho;
    }

    //setters
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    //getters
    public double getAltura(){
        return this.altura;
    }
    public double getAncho(){
        return this.ancho;
    }
    //Override area method
    @Override
    public double area(){
        return (altura * ancho) / 2;
    }
    
    
}
