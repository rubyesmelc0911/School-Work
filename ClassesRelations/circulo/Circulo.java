package circulo;

import punto.Punto;

public class Circulo {
    private Punto C, P;

    public Circulo(Punto C, Punto P){
        this.C = C;
        this.P = P;
    }

    public void setP(Punto P){
        this.P = P;
    }

    public void setC(Punto C){
        this.C = C;
    }

    public Punto getPuntoP(){
        return this.P;
    }

    public Punto getPuntoC(){
        return this.C;
    }

    public double getArea(){
        double radio = C.distancia(P);
        return Math.PI*Math.pow(radio,2);
    }

    public double getPermietro(){
        double radio = C.distancia(P);
        return 2*Math.PI*radio;
    }
    
    
}
