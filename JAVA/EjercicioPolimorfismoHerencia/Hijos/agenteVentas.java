package EjercicioPolimorfismoHerencia.Hijos;

import EjercicioPolimorfismoHerencia.Padre.empleado;

public class agenteVentas extends empleado{
     private String Zonas;
    private String PorcComision;
    private double valesDespensa;

    public agenteVentas(String nombre, String apellidoMat, String apellidoPat, int numEmpleado, float sueldo, String puesto, String Zonas, String PorcComision, double valesDespensa){
        super(nombre, apellidoMat, apellidoPat, numEmpleado, sueldo, puesto); //usar super class 
        this.Zonas = Zonas;
        this.PorcComision = PorcComision;
        this.valesDespensa = valesDespensa;
    }

    //setters
    public void setZonas(String Zonas){
        this.Zonas = Zonas;
    }

    public void setPorcComision(String PorcComision){
        this.PorcComision = PorcComision;
    }

    public void setvalesDespensa(double valesDespensa){
        this.valesDespensa = valesDespensa;
    }

    //getters
    public String getPorcComision(){
        return this.PorcComision;
    }

     public String getZonas(){
        return this.Zonas;
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
        "Comision: " + getPorcComision() + "\n" +
        "Zona: " + getZonas() + "\n" ;
    }
}
