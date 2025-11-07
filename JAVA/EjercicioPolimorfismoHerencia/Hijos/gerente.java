package EjercicioPolimorfismoHerencia.Hijos;

import EjercicioPolimorfismoHerencia.Padre.empleado;

public class gerente extends empleado {

    private String marcaTel;
    private String marcaCoche;
    private double valesRest;

    public gerente(String nombre, String apellidoMat, String apellidoPat, int numEmpleado, float sueldo, String puesto, String marcaTel, String marcaCoche, double valesRest){
        super(nombre, apellidoMat, apellidoPat, numEmpleado, sueldo, puesto); //usar super class 
        this.marcaTel = marcaTel;
        this.marcaCoche = marcaCoche;
        this.valesRest = valesRest;
    }

    //setters
    public void setMarcaTel(String marcaTel){
        this.marcaTel = marcaTel;
    }

    public void setMarcaCoche(String marcaCoche){
        this.marcaCoche = marcaCoche;
    }

    public void setValesRest(double valesRest){
        this.valesRest = valesRest;
    }

    //getters
    public String getMarcaCoche(){
        return this.marcaCoche;
    }

     public String getMarcaTel(){
        return this.marcaTel;
    }

     public double getVales(){
        return this.valesRest;
    }

    //Usar funcion abstract para mostrar info mediante polimorfismo
    @Override
    public String mostrarDatos(){
        return "Nombre: " + getNombre() +"\n" +
        "Apellido materno: " + getApMat() + "\n" +
        "Apellido paterno: " + getApPat() + "\n" +
        "Marca Coche: " + getMarcaCoche() + "\n" +
        "Marca Tel: " + getMarcaTel() + "\n" ;
    }
}
