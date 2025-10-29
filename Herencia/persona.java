package Herencia;

public class persona {
    protected String nombre;
    protected int edad;
    protected String id;
    protected String CURP;
    protected String apellidos;
    protected String telefono;
    protected String direccion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getId() {
        return id;
    }

    public String getCURP() {
        return CURP;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }


    
}
