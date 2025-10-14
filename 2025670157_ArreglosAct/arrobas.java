package arreglos;
import java.util.Scanner;
//Ruhy Esmeralda Lopez Correa --2025670157

public class arrobas {
    private int[] numeros;
    private int n;

    public arrobas(){
        //constructor
        this.n = 5;
    }
    //setter
    public void setData(int n, int[] array){
        this.n = n;
        this.numeros = array;
    }
//getters
    public int getN(){
        return n;
    }
    
    public int[] getArray(){
        return numeros;
    }
    //metodo
    public void imprimirArrobas(){
        int repeticiones;
        for(int i= 0; i < n; i++){ //acceder a cada espacio del array
            repeticiones = numeros[i]; //obtener el numero en el espacio, que seran las repeticiones
            for(int j=0;j<repeticiones;j++){
                System.out.print("@"); //imprimir un arroba hasta llegar al total de repeticiones
            }
            System.out.println("/n"); //hacer un salto de espacio
        }
    }

    public static void main(String[] args){
        arrobas obj = new arrobas();
        int n = 5;
        Scanner Data = new Scanner(System.in);
        int[] array = new int[n];

        System.out.println("Ingrese los datos del arreglo para imprimir arrobas:)");
        for(int i=0; i<n; i++){
            System.out.println("Ingrese numero en posicion "+ (i+1)+" :");
            array[i] = Data.nextInt();
        }

        obj.setData(n, array);
        obj.imprimirArrobas();
        Data.close();
    }
}
