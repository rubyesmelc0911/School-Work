import java.util.ArrayList;

public class arrayIntDynamic {
    public static void main(){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int opcion=0;
        do{
            System.out.println("Ingrese un numero entero");
            numeros.add(Integer.parseInt(System.console().readLine()));
            System.out.println("Desea ingresar otro numero? 1.No 2.Si");
            opcion = Integer.parseInt(System.console().readLine());
        }while(opcion!=1);
        int sum = numeros.stream().mapToInt(Integer::intValue).sum(); //calcular suma con funcion stream de java
        double average = numeros.stream().mapToInt(Integer::intValue).average().orElse(0); //funcion stream de java
        int min = numeros.stream().mapToInt(Integer::intValue).min().orElse(0);
        int max = numeros.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Promedio: "+ average);
        System.out.println("Suma: "+ sum);
        System.out.println("Valor maximo: "+ max);
        System.out.println("Valor minimo: " + min);
    }
    
}
