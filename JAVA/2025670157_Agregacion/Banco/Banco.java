package AgregacionBanco.Banco;

import AgregacionBanco.Empleado.Empleado;

public class Banco {
    private String nombre;
    private Empleado[] empleados = new Empleado[4]; //arreglo de empleados creando 4 lugares para empleados
    private int numClientes = 0;

    public Banco(){
       this.empleados = new Empleado[4]; 
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados[this.numClientes] = empleado; //accedemos a la posicion del arreglo y guardamos cliente
        ++this.numClientes; //asi se suma en java
    }

    public void mostrarEmpleados(){
        for(int i = 0; i < this.numClientes; ++i){
            Empleado empleadoPrint = this.empleados[i];
            System.out.println("Nombre: "+ empleadoPrint.getNombre());
            System.out.println("Telefono: "+ empleadoPrint.getTelefono());
        }
    }

    public int buscarEmpleado(String Nombre){
        for(int i =0; i< this.numClientes; ++i){
            if(this.empleados[i].getNombre().equals(Nombre)){
                Empleado empleadoEncontrado = this.empleados[i];
                System.out.println("Telefono: "+ empleadoEncontrado.getTelefono());
                System.out.println("Direccion: "+ empleadoEncontrado.getDireccion());
                return i;
            }
        }
        return this.numClientes;
    }

    public void modificarEmpleado(int i, String Tel){
        this.empleados[i].setTelefono(Tel); //para esto sirven los setters por si solos
    }

    public int getNumEmpleados(){
        return this.numClientes;
    }
}