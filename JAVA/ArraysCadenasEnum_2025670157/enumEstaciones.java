import enumEstacion.estaciones;
import java.util.Scanner;

public class enumEstaciones {
    public static void main(){
        Scanner input = new Scanner(System.in);
        String estacionInput;
        System.out.println("Ingrese una estacion: ");
        
        estacionInput =  input.nextLine();
        estaciones[] vals = estaciones.values();

        for(estaciones i: estaciones.values()){
           if(estacionInput.toUpperCase().equals("INVIERNO")){
            System.out.println("Siguiente estacion: ");
            System.out.println(vals[0]);
           }
              else if(estacionInput.toUpperCase().equals(i.name())){
                System.out.println("Siguiente estacion: ");
                System.out.println(vals[i.ordinal()+1]);
              }
        }

        input.close();
        
    }
    
}
