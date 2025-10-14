package arreglos;
//Ruby Esmearlda Lopez Correa - 2025670157
import java.util.Scanner;
public class arreglosActividades {
    private int n = 0;
    private int[] numeros = new int[n];

    public arreglosActividades(){
        //constructor
        this.n = 5;
    }
    public void setData(int n, int array[]){
        //encapsulamiento setters
        this.n = n;
        this.numeros = array;
    }

    //encapsulamiento getters
    public int getData(){
        return n;
    }
    public int[] getArray(){
        return numeros;
    }

    //metodos de la clase
    public int sumaElementos(){
        //hacer la suma de los elementos del arreglo
        int suma = 0;
        for(int i = 0; i<n; i++){
            suma += numeros[i];
        } 
        return suma;
    }

    public double promedioElementos(){
        //hacer el promedio de los elementos del arreglo
        double promedio = 0;
        promedio = (double)sumaElementos() / n;
        return promedio;
    }
    public int elementosPositivos(){
        //contar los elementos positivos del arreglo
        int contador = 0;

        for(int i =0; i < n; i++){
            if(numeros[i] > 0){
                contador++;
            }
        }
        return contador;
    }

    public int elementosNegativos(){
        //contar los elementos negativos del arreglo
        int contador = 0;
        for(int i=0;i<n; i++){
            if(numeros[i]<0){
                contador++;
            }
        }
        return contador;
    }


    public static void main(String[] args){
        //crear instancia de clase
        arreglosActividades obj = new arreglosActividades();
        int n = 5;
        int[] array = new int[n];
        Scanner Data = new Scanner(System.in);
        //pedir datos
        System.out.println("Ingrese " + n + " numeros enteros (positivos y negativos):");
        for(int i =0; i<n; i++)
    {
        System.out.print("Numero " + (i+1) + " : ");
        array[i] = Data.nextInt();
    }        //mostrar resultados de metodos
    obj.setData(n, array);
        System.out.println("La suma de los elementos es: " + obj.sumaElementos());
        System.out.println("El promedio de los elementos es: " + obj.promedioElementos());
        System.out.println("La cantidad de elementos positivos es: " + obj.elementosPositivos());
        System.out.println("La cantidad de elementos negativos es: " + obj.elementosNegativos());
        Data.close(); //prevenir leaks
    }
}
