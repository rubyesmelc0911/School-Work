package EjercicioPolimorfismoHerencia.Padre;

public abstract class empleado {
    protected String nombre;
    protected String apellidoMat;
    protected String apellidoPat;
    protected int numEmpleado;
    protected float sueldo;
    protected String puesto;

    //constructor
    public empleado(String nombre, String apellidoMat, String apellidoPat, int numEmpleado, float sueldo, String puesto){
        this.nombre = nombre;
        this.apellidoMat = apellidoMat;
        this.apellidoPat = apellidoPat;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    //abstract functions for polimorphism
    public abstract String mostrarDatos();

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

     public void setApMat(String apellido){
        this.apellidoMat = apellido;
    }
     public void setApPat(String apellido){
        this.apellidoPat = apellido;
    }
    
    public void setNumEmpleado(int numEmpleado){
        this.numEmpleado = numEmpleado;
    }

    public void setSueldo(float sueldo){
        this.sueldo = sueldo;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    //getters
     public String getNombre(){
        return this.nombre;
    }

     public String getApMat(){
        return this.apellidoMat ;
    }
     public String getApPat(){
        return this.apellidoPat;
    }
    
    public int getNumEmpleado(){
        return this.numEmpleado;
    }

    public float getSueldo(){
        return this.sueldo;
    }

    public String getPuesto(){
        return this.puesto;
    }


}
