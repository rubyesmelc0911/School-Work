package EnumType;
import java.util.Scanner;

import EnumType.Dia.dia;

public class EnumType {
   
    public static void main(){
        Scanner dato = new Scanner(System.in);
        String diaOption;
        dia Diaplace;
        boolean Repetir = false;

        System.out.println("Elige un dia: ");
        while(Repetir==false){
            for(dia i: dia.values()){
                System.out.println("* "+i);
        }

        diaOption = dato.next();
        diaOption = diaOption.toUpperCase();
        for (dia i: dia.values()){
            if(diaOption.equals(i.name())){
                Diaplace = dia.valueOf(diaOption);
                System.out.println("Dia encontrado");
                System.out.println("Lugar: "+Diaplace);
                Repetir = true;
                break;
            }
        }
        if(Repetir!=true){
            System.out.println("Vuelve a elegir un dia correcto");
        }
        }//while
        dato.close();
    }
}
