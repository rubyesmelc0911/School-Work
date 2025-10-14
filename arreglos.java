import java.util.Scanner;

public class arreglos {
    private int[] numeros = new int[3]; //create an array of integers width 3

    public int[] getNumeros(){
        return numeros;
    }

    public void setNumeros(int[] numeros){
        this.numeros = numeros;
    }

    public arreglos(){

    }
    public int sumarArreglo(){
        int suma = 0;
        for(int i=0; i< numeros.length; i++){
            suma += numeros[i]; //create the sum of the array gettint values and adding them to the variable 
        }
        return suma;
    }

    public static void main(String[] args){
        //    MyObject[] objectArray = new MyObject[3]; // Creates an array to hold 3 MyObject instances
        arreglos obj1 = new arreglos();
        int[] valores = new int[3];
        Scanner Datos = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Ingrese un numero en posicion: "+(i+1));
            valores[i] = Datos.nextInt();
        }
        obj1.setNumeros(valores);
        System.out.println("La suma es: "+obj1.sumarArreglo());

        Datos.close();
    }
}
