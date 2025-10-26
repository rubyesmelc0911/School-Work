import java.util.ArrayList;

public class ejercicioUnoTres {
    public static void main(String[] args) {
    ArrayList<String> textos = new ArrayList<String>();
    int opcion=0;
    do{
        System.out.println("Ingresar texto");
        textos.add(System.console().readLine()); //forma de agregar texto desde consola a el arreglo dinamico
        System.out.println("Desea ingresar otro texto? 1.No 2.Si");
        opcion = Integer.parseInt(System.console().readLine());
        
    }while(opcion!=1);
    System.out.println("Los textos ingresados son:");
    for(String texto: textos){
        System.out.println(texto);
    }
    System.out.println("Invertidos son");
    for(int i= textos.size() -1;i>=0;i--){
        System.out.println(""+textos.get(i));
    }
    
    }                                                                           
}
