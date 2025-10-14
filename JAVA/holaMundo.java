public class holaMundo {
    private String texto;

    public void saludo(){
        System.out.println("x:"+texto); //access the private variable from the class method
    }

    public void setSaludo(String texto){
        this.texto = texto; //this makes reference to the instance variable which is private and needs a setter
    }

    public static void main(String[] args){
        holaMundo hola = new holaMundo(); //creates an instance of the class
        hola.setSaludo("ayo wattup"); //this is how you set the value of the instance variable
        hola.saludo(); //this way it prints the value of the instance variable
    }
}
