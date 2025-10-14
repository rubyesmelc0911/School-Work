import circulo.Circulo;
import punto.Punto;
import triangulo.Triangulo;

public class asociacion {
    public static void main(String[] args){
        //Composicion
        Punto Punto1 = new Punto(1,1);
        Punto Punto2 = new Punto(2,1);
        Circulo circulo = new Circulo(Punto1, Punto2);

        
        System.out.println("El area es:"+ circulo.getArea());
        System.out.println("El perimetro es"+circulo.getPermietro());


        Punto a = new Punto(0,0);
        Punto b = new Punto(4,0);
        Punto c = new Punto(0,3);
        Triangulo triangulo = new Triangulo(a, b, c);

        System.out.println("El perimetro del triangulo es:"+ triangulo.getPerimetroTriangulo());
        System.out.println("El area del triangulo es:"+ triangulo.getArea());
    }


}
