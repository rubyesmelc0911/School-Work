package AgregacionBanco.Empleado;

public class Empleado {
    private String nombre;
    private String numempleado;
    private String direccion;
    private String telefono;

    public Empleado(String nombre, String numempleado, String direccion, String telefono){
        this.nombre = nombre;
        this.numempleado = numempleado;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getNumEmpleado(){
        return this.numempleado;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getTelefono(){
        return this.telefono;
    }

    //setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setNumEmpleado(String num){
        this.numempleado = num;
    }
}
