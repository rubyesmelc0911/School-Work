package Herencia.Empleado;
import Herencia.persona;

public class empleado extends persona{
    
    private String num_empleado;
    private double salario;
    private String cargo;
    
    public empleado(String nombre, int edad, String id, String CURP, String apellidos, String telefono, String direccion,String num, String cargo, double salario){
        super(nombre, edad, id, CURP, apellidos, telefono, direccion);
        this.num_empleado = num;
        this.salario = salario;
        this.cargo = cargo;
    }

    //setters
    public void setNum_empleado(String num_empleado) {
        this.num_empleado = num_empleado;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario(){
        return this.salario;
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

    public String getCargo(){
        return this.cargo;
    }

    public String getN(){
        return this.num_empleado;
    }

    //mostrar
     @Override
    public String mostrarDatos(){
        return "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "ID: " + getId() + "\n" +
               "CURP: " + getCURP() + "\n" +
               "Apellidos: " + getApellidos() + "\n" +
               "Teléfono: " + getTelefono() + "\n" +
               "Dirección: " + getDireccion() + "\n" +
               "Num Empleado: " + getN() + "\n" +
               "Salario: " + getSalario() + "\n" +
               "Cargo: " + getCargo();
    }
    


}
