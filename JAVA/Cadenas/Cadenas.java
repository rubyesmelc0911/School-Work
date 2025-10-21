public class Cadenas{
    public static void main(String[] args){
        String Cad1, Cad2, Cad3;
        Cad1 = "Hola";
        Cad2 = "Hola Ruby, como estas";

        //toma el elemento de la posicion en la cadena
        System.out.println(""+Cad1.charAt(3));
        System.out.println(""+Cad2.charAt(8));
        Cad3 = "Hola";
        //Compara cad1 con cad3
        System.out.println(""+Cad1.equals(Cad3));
        System.out.println(""+Cad1.equals("hola"));
        //comparar sin tomar en cuenta mayusculas o minusculas
        System.out.println(""+Cad1.equalsIgnoreCase("holA"));
        //compara cadena uno y cadena tres
        System.out.println(""+Cad1.compareTo(Cad3));
        System.out.println(""+Cad1.compareTo("hola"));
        //concatenar dos cadenas
        System.out.println(""+Cad1.concat(Cad2));
        //Buscar una cadena dentro de otra
        System.out.println(""+Cad1.contains(Cad3));
        //muestra la posicion apartir de la cual se encuentra la cadena
        System.out.println(""+Cad2.indexOf(Cad1));
        System.out.println(""+Cad2.indexOf("estas"));
        //tamaño de una cadena
        System.out.println(""+Cad2.length());
        //reemplazar las a por las e
        System.out.println(""+Cad2.replace("a", "e"));
        String Cads[] = Cad2.split(" ");
        for(int i=0;i<= Cads.length;i++){
            System.out.println(""+Cads[i]);
        }

        //valida si empieza con cierta cadena
        System.out.println(""+Cad2.startsWith(Cad1));
        //Obtiene una subcadena desde 7 hasta 11
        System.out.println(""+Cad2.substring(7,11));
        //conveirte a mayusculas
        System.out.println(""+Cad2.toUpperCase());
        //convierte a minuscula
        System.out.println(""+Cad2.toLowerCase());
        //quita espacios
        System.out.println(""+Cad3);
        System.out.println(""+Cad3.trim());
        

    }
}