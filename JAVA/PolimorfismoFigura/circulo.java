package PolimorfismoFigura;

public class circulo extends figura {
    private double radio;

    public circulo(double radio){
        this.radio = radio;
    }

    //setter
    public void setRadio(double radio){
        this.radio = radio;
    }

    //getter
    public double getRadio(){
        return this.radio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

} 
