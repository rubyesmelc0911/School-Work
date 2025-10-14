package AgregacionBanco;
import AgregacionBanco.Banco.Banco;
import AgregacionBanco.Empleado.Empleado;
import java.util.Scanner;

public class Agregacion {
    public Agregacion(){
        //constructor
    }

    public static void main(String[] args){ //unica clase principal que puede tener el main
        Banco banco = new Banco(); //creacion de una instancia de banco
        Scanner Dat = new Scanner(System.in);
        int Opc = 0 ;

        try{
            do{
                System.out.println("Ingresar empleado: ........................... 1");
                System.out.println("Mostrar empleados: ........................... 2");
                System.out.println("Buscar empleados: ............................ 3");
                System.out.println("Modificar empleado: .......................... 4");
                System.out.println("Salir ....................................... 5");
                Opc = Dat.nextInt();
                Dat.nextLine();
                String Nom, Tel, dir, numEmpleado;
                int i;
                switch (Opc) {
               case 1:
                  System.out.println("Nombre: ");
                  Nom = Dat.nextLine();
                  System.out.println("Telefono: ");
                  Tel = Dat.nextLine();
                  System.out.println("Direccion: ");
                  dir = Dat.nextLine();
                  Empleado nuevoEmpleado = new Empleado(Nom, numEmpleado, dir, Tel);
                  banco.agregarEmpleado(nuevoEmpleado);
                  break;
               case 2:
                  banco.mostrarEmpleados();
                  break;
               case 3:
                  System.out.println("Nombre empleado a buscar: ");
                  Nom = Dat.nextLine();
                  i = banco.buscarEmpleado(Nom);
                  if (i == banco.getNumEmpleados()) {
                     System.out.println("Cliente no encontrado");
                  }
                  break;
               case 4:
                  System.out.println("Nombre cliente a modificar: ");
                  Nom = Dat.nextLine();
                  i = banco.buscarEmpleado(Nom);
                  if (i != banco.getNumEmpleados()) {
                     System.out.println("Telefono");
                     Tel = Dat.nextLine();
                     banco.modificarEmpleado(i, Tel);
                  }
                  break;
               case 5:
                  System.out.println("Adios");
                  break;
               default:
                  System.out.println("No es una opcion valida");
            }

            }while(Opc!=5);

        }catch(Exception var7){

        }

        
    }
    
}
