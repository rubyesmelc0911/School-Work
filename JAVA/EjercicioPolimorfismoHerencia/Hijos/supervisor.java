package EjercicioPolimorfismoHerencia.Hijos;

import EjercicioPolimorfismoHerencia.Padre.empleado;

public class supervisor extends empleado {
    private String areaTrabajo;
    private String Turno;
    private double valesDespensa;

    public supervisor(String nombre, String apellidoMat, String apellidoPat, int numEmpleado, float sueldo, String puesto, String areaTrabajo, String Turno, double valesDespensa){
        super(nombre, apellidoMat, apellidoPat, numEmpleado, sueldo, puesto); //usar super class 
        this.areaTrabajo = areaTrabajo;
        this.Turno = Turno;
        this.valesDespensa = valesDespensa;
    }

    //setters
    public void setareaTrabajo(String areaTrabajo){
        this.areaTrabajo = areaTrabajo;
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

     public String getareaTrabajo(){
        return this.areaTrabajo;
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
        "Turno: " + getTurno() + "\n" +
        "Area trabajo: " + getareaTrabajo() + "\n" ;
    }
    
}
