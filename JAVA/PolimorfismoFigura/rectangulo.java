package PolimorfismoFigura;

public class rectangulo extends figura{
    private double lado;
    private double ancho;


    public rectangulo(double lado, double ancho){
        this.lado = lado;
        this.ancho = ancho;
    }

    //setters
    public void setLado(double lado){
        this.lado = lado;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    //getters
    public double getLado(){
        return this.lado;
    }
    public double getAncho(){
        return this.ancho;
    }

    //Override area method
    @Override
    public double area(){
        return lado * ancho;
    }


}