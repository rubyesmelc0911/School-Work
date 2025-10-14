package triangulo;

import punto.Punto;

public class Triangulo {
    //variables punto 
    private Punto A, B, C;

    //constructor
    public Triangulo(Punto A, Punto B, Punto C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    //getters and setters
    public void setA(Punto A){
        this.A = A;
    }

    public void SetB(Punto B){
        this.B = B;
    }

    public void setC(Punto C){
        this.C = C;
    }

    public Punto getA(){
        return this.A;
    }

    public Punto getB(){
        return this.B;
    }

    public Punto getC(){
        return C;
    }

    public double getArea(){
        double a = this.B.getY() - this.C.getY(); //y2-y3
        double b = this.C.getY() - this.A.getY(); //y3 - y1
        double c = this.A.getY() - this.B.getY(); //y1-y2

        double area = 0.5*((this.A.getX() * a)+ (this.B.getX() * b) + (this.C.getX() * c) );
        return area;
    }

    public double getPerimetroTriangulo(){
        double ladoAB = A.distancia(B); 
        double ladoBC = B.distancia(C);
        double ladoAC = A.distancia(C);
        return ladoAB + ladoBC + ladoAC;
    }

    
}
