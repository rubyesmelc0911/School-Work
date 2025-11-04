package Herencia.estudiante;
import Herencia.persona;

public class estudiante extends persona{
    private String boleta;
    private String programa;
    private int semestre;

    public estudiante(String nombre, int edad, String id, String CURP, String apellidos, String telefono, String direccion,String boleta, String programa, int semestre){
        super(nombre, edad, id, CURP, apellidos, telefono, direccion);
        this.boleta = boleta;
        this.programa = programa;
        this.semestre = semestre;
    }

    public estudiante(){
    }

    public void setBoleta(String boleta){
        this.boleta = boleta;
    }
    public void setPrograma(String programa){
        this.programa = programa;
    }
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    public String getBoleta(){
        return this.boleta;
    }
    public String getPrograma(){
        return this.programa;
    }
    public int getSemestre(){
        return this.semestre;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "ID: " + getId() + "\n" +
               "CURP: " + getCURP() + "\n" +
               "Apellidos: " + getApellidos() + "\n" +
               "Teléfono: " + getTelefono() + "\n" +
               "Dirección: " + getDireccion() + "\n" +
               "Boleta: " + getBoleta() + "\n" +
               "Programa: " + getPrograma() + "\n" +
               "Semestre: " + getSemestre();
    }
}