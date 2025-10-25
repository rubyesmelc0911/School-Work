package arreglos;
import java.util.ArrayList;

public class dynamicArray {
    public static void main(){
        ArrayList<String> Carros = new ArrayList<String>(); //declarar un arreglo dinamico

        //agregar marcas de carros
        Carros.add("Volvo");
        Carros.add("BMW");
        Carros.add("Ford");
        Carros.add("Chrysler");
        Carros.add("Mazda");

        //mostrar el arreglo
        System.out.println(""+Carros);
        System.out.println(""+Carros.get(3));
        for (int i=0;i<Carros.size();i++){
            System.out.println(""+Carros.get(i));
        }

        Carros.remove(2);
        Carros.set(3, "Jeep");

        for(String i: Carros){ //Esto ya toma en la variable el valor del array
            System.out.println(""+i);
        }

        ArrayList<Integer> Num = new ArrayList<Integer>();
        Num.add(5);
        Num.add(5);
        Num.add(5);

        for(int i: Num){
            System.out.println(""+i);
        }
        

    }
}
