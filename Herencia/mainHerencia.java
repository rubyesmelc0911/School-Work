package Herencia;
import Herencia.persona;
import Herencia.estudiante.estudiante;
import Herencia.Empleado.empleado;
public class mainHerencia {
    public static void main(String[] args) {
        persona[] personas = new persona[5];

        personas[0] = new empleado("RUBYS",19,"1213","GAEC8127381","LOPEZ","123123123", "MORELOS", "123123","JEFE",15000.0); 
        personas[1] = new estudiante("Christian", 23, "432", "CAEG8127381", "GOMEZ", "321321321", "PUEBLA", "2019111234", "INGENIERIA EN SISTEMAS COMPUTACIONALES", 6);

        personas[0].mostrarDatos();
        personas[1].mostrarDatos();
    }
}
