public class ejercicio_CyA {
    public static void main(String[] args) {
        //cargar una string con la cadena
        String cadenaUno = "Cadena de prueba, hola!";
        //contar el numero de letras que tiene
        int numeroLetras = cadenaUno.length();
        System.out.println("Numero de letras: " + numeroLetras);
        //contar el numero de palabras
        System.out.println("Numero de palabras: " + cadenaUno.split(" ").length);
        //contar el numero de <<a>>
        System.out.println("Numero de letras 'a': " + (cadenaUno.length() - cadenaUno.replace("a", "").length()));
        //invertir palabra a palabra
        String[] palabras = cadenaUno.split(" "); //separar palabras
        String cadenaInvertidaPalabra = ""; //cadena resultante
        for (int i = palabras.length - 1; i >= 0; i--) {
            cadenaInvertidaPalabra += palabras[i] + " "; //colocar las palabras en orden inverso
        }
        System.out.println("Cadena invertida palabra a palabra: " + cadenaInvertidaPalabra.trim());
        //invertir letra a letra
        String cadenaInvertidaLetra = ""; //cadena resultante
        for (int i = cadenaUno.length() - 1; i >= 0; i--) {
            cadenaInvertidaLetra += cadenaUno.charAt(i); //colocar las letras en orden inverso
        }
        System.out.println("Cadena invertida letra a letra: " + cadenaInvertidaLetra);
        
        String cadenaDos = "Otra cadena de prueba, hola!";
        //comparar las dos trings y decir si son iguales
        if(cadenaUno.equals(cadenaDos)){
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
        //crear la string c con la concatenacion de a y b
        String cadenaConcatenada = cadenaUno.concat(cadenaDos);
        System.out.println("Cadena concatenada: " + cadenaConcatenada);

    //crear string d con concatenacion de a y b otra vez
        String cadenaConcatenadaDos = cadenaUno.concat(cadenaDos);
        System.out.println("Cadena concatenada dos: " + cadenaConcatenadaDos);

        //comparar c y d y decir si son iguales
        if(cadenaConcatenada.equals(cadenaConcatenadaDos)){
            System.out.println("Las cadenas concatenadas son iguales.");
        } else {
            System.out.println("Las cadenas concatenadas son diferentes.");

        }
        //indicar cuantos caracteres tiene cada una de las strings
        System.out.println("Cadena Uno tiene " + cadenaUno.length() + " caracteres.");
        System.out.println("Cadena Dos tiene " + cadenaDos.length() + " caracteres.");
        //copiar la string a en la b 
        cadenaDos.replaceAll(cadenaDos, cadenaUno);
        System.out.println("Cadena Dos despues de copiar Cadena Uno: " + cadenaDos);
        //mostrar las dos strings
        System.out.println("Cadena Uno: " + cadenaUno);
        System.out.println("Cadena Dos: " + cadenaDos);
        
    }
}