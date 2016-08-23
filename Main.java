
import java.io.IOException;
import java.util.Scanner;

/*
*Josué Cifuentes 15275
*Pablo Muñoz 15258
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a la calculadora de archivos con información en postfix.");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la dirección del archivo con la operación a realizar.");
        System.out.println("Por ejemplo: C:\\Users\\User\\Documents\\doc.txt");
        String doc = teclado.nextLine(); //Solicita la dirección del documento que se quiere abrir.
        Lector operacion = new Lector(doc);
        try{
            String[] lines = operacion.openFile(); //Trata de abrir el archivo para su lectura.
        }
        catch (IOException e){
            System.out.println("El archivo no existe o no se puede leer."); //Si no logra abrir el archivo.
        }
        boolean correcto = false;
        String decision = "";
        while (!correcto && operacion.getLineas() != 0){
            System.out.println("Ingrese el número del Stack que desea implementar:");
            System.out.println("1. ArrayList Stack\n2. Vector Stack\n3. List Stack");
            decision = teclado.nextLine(); //Solicita al usuario el tipo de Stack que desea utilizar.
            if (decision.equals("1") || decision.equals("2") || decision.equals("3"))
                correcto = true; //Valida que el Stack esté entre las opeciones posibles.
            if (!correcto)
                System.out.println("VALOR INVALIDO. Ingrese un número entero de 1 a 3.");
        }
        
        if (operacion.getLineas() != 0){
            Calculadora calc = new Calculadora(operacion.getOperacion(), decision); //Realiza cálculos si el usuario ingresó la dirección correctamente y si se tiene una decisión válida de Stack.
            System.out.println("La respuesta es: "+Integer.toString(calc.operar()));
        }
    }
    
}
