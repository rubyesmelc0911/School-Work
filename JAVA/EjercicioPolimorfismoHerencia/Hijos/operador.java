package EjercicioPolimorfismoHerencia.Hijos;

import EjercicioPolimorfismoHerencia.Padre.empleado;

public class operador extends empleado{
    private String AreaTrabajo;
    private String Turno;
    private double valesDespensa;

    public operador(String nombre, String apellidoMat, String apellidoPat, int numEmpleado, float sueldo, String puesto, String AreaTrabajo, String Turno, double valesDespensa){
        super(nombre, apellidoMat, apellidoPat, numEmpleado, sueldo, puesto); //usar super class 
        this.AreaTrabajo = AreaTrabajo;
        this.Turno = Turno;
        this.valesDespensa = valesDespensa;
    }

    //setters
    public void setAreaTrabajo(String AreaTrabajo){
        this.AreaTrabajo = AreaTrabajo;
    }

    public void setTurno(String Turno){
        this.Turno = Turno;
    }

    public void setvalesDespensa(double valesDespensa){
        this.valesDespensa = valesDespensa;
    }

    //getters
    public String getTurno(){
        return this.Turno;
    }

     public String getAreaTrabajo(){
        return this.AreaTrabajo;
    }

     public double getVales(){
        return this.valesDespensa;
    }

    //Usar funcion abstract para mostrar info mediante polimorfismo
    @Override
    public String mostrarDatos(){
        return "Nombre: " + getNombre() +"\n" +
        "Apellido materno: " + getApMat() + "\n" +
        "Apellido paterno: " + getApPat() + "\n" +
        "Marca Coche: " + getTurno() + "\n" +
        "Marca Tel: " + getAreaTrabajo() + "\n" ;
    }
}
