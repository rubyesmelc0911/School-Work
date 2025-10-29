package Herencia.estudiante;
import Herencia.persona;

public class estudiante extends persona{
    private String boleta;
    private String programa;
    private int semestre;

    public estudiante(String boleta, String programa, int semestre){
        this.boleta = boleta;
        this.programa = programa;
        this.semestre = semestre;
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
}