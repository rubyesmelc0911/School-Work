public class atributos{
    //attributes of instance
    private int x;
    private int y;
    //attribute of class
    public static int Total;

    public atributos(int a, int b){
        x =a;
        y = b;
        Total++;
    }
    //getters and setters for instance attributes
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }

    public void setx(int valor){
        x = valor;
    }

    public void sety(int valor){
        y = valor;
    }

    //getters and setters for class attributes
    public static void setTotal(int valor){
        atributos.Total = valor;
    }

      public static int getTotal(){
        return atributos.Total;
    }


    public static void main(){
        atributos obj = new atributos(3,4);
        System.out.println("x: " + obj.getx());

        atributos obj2 = new atributos(5,6);
        System.out.println("x: " + obj2.getx());
        System.out.println("y: " + obj2.gety()); //accessing instance attributes
        System.out.println("Total de objetos: " + atributos.getTotal()); //accessing class attribute statically
        System.out.println(Math.PI); //accessing attribute from Math class

    }

}