package PolimorfismoFigura;

public class principal {
    
    public static void main(){
        figura circ = new circulo(5);
        figura rect = new rectangulo(3, 7);
        figura tri = new triangulo(10, 4);

        System.out.println("Area del circulo:"+ circ.area());
        System.out.println("Area del rectangulo:"+ rect.area());
        System.out.println("Area del triangulo:"+ tri.area());
    }
}
