import java.util.Scanner;

public class calculadora {
    private double resultado, num1, num2; //atributes

    public calculadora(double Num1, double Num2){ //this is a constructor which is the most common
        this.num1 = Num1;
        this.num2 = Num2;
    }

    public calculadora(calculadora ob){ //constructor mediante copia
        this.num1 = ob.num1; 
        this.num2 =  ob.num2;
    }

    public void setNumbers(int n1, int n2){ //setter
        this.num1 = n1;
        this.num2 = n2;
    }
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }

    public double suma(){ //method to sum
        resultado = num1 + num2;
        return resultado;
    }
    public double resta(){
        resultado = num1 - num2;
        return resultado;
    }
    public double multiplicacion(){
        resultado = num1 * num2;
        return resultado;
    }   
    public double division(){
        if(num2 != 0){
            resultado = num1 / num2;
            return resultado;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        calculadora calc = new calculadora(4,6); //create new instance of the class and through the constructor assign value 
        //calculadora calc2 = new calculadora(calc); //por copia, lleva la clase dentro de el
        int opc;
        double n1,n2;
        Scanner Datos = new Scanner(System.in);

        do{
            System.out.println("ELIJA UNA OPCION PARA REALIZAR");
            System.out.println("Suma....................1");
            System.out.println("Resta...................2");
            System.out.println("Division................3");
            System.out.println("Multiplicacion..........4");
            System.out.println("Salir...................5");
            opc = Datos.nextInt();
            System.out.println("Numero 1:");
            n1 = Datos.nextDouble();
            System.out.println("Numero 2:");
            n2 = Datos.nextDouble();
        
            if(opc >= 1 && opc <= 4){
                switch(opc){
                    case 1 ->System.out.println("La suma es:"+ calc.suma());
                    case 2 -> System.out.println("La resta es"+ calc.resta());
                    case 3 -> System.out.println("La division es: "+ calc.division());
                    case 4 -> System.out.println("La multiplicacion es: "+ calc.multiplicacion());
                    default -> System.out.println("No anda eligiendo bien");
                }
            }else{
                System.out.println("No ha tomado una eleccion correcta");
            }
        }while(opc!=5);
       

        System.gc(); //destructor
      
    }

  
    
}
