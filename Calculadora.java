/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*Josué Cifuentes 15275
*Pablo Muñoz 15258
*/
/**
 *
 * @author Josue
 */
public class Calculadora {
    /*parámetros*/
    private String operacion;
    private AbstractStack<String> pila;
    
    /**
     *Constructor
     * @param op
     * @param decision
     */
    public Calculadora(String op, String decision){
        operacion = op; //String con la operación leída del archivo txt
        StackFactory factory = new StackFactory<String>();
        pila = factory.getStack(decision); //El StackFactory decidirá que tipo de Stack se utiliza dependiendo de la decisión del usuario.
    }
    
    /**
     *
     * @return
     */
    public int operar(){
        int respuesta = 0;
        String[] elementos = operacion.split(" "); //Divide la cadena en pequeños Strings y la partición se realiza en los espacios vacíos.
        for (int i = 0; i < elementos.length; i++){
            if (esNumero(elementos[i]))
                pila.push(elementos[i]); //Si el elemento es un número, se guarda en pila.
            else{ //Si es un operando, se verifica cual operando es para realizar dicha operación.
                if (elementos[i].equals("+"))
                    respuesta = suma();
                else if (elementos[i].equals("-"))
                    respuesta = resta();
                else if (elementos[i].equals("*"))
                    respuesta = multiplicacion();
                else
                    respuesta = division();
                pila.push(Integer.toString(respuesta)); //El resultado se guarda en pila.
            }
        }
        return Integer.parseInt(pila.pop());
    }
    
    /**
     *Saca dos valores de pila y los suma.
     * @return
     */
    public int suma(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num1+num2);
    }

    /**
     *Saca dos valores de pila y los resta.
     * @return
     */
    public int resta(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num2-num1);
    }
    
    /**
     *Saca dos valores de pila y los multiplica.
     * @return
     */
    public int multiplicacion(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num1*num2);
    }
    
    /**
     *Saca dos valores de pila y los divide.
     * @return
     */
    public int division(){
        int num1 = Integer.parseInt(pila.pop());
        int num2 = Integer.parseInt(pila.pop());
        return (num2/num1);
    }
    
    /**
     *Verifica si un valor en String es número o no.
     * @param dato
     * @return
     */
    public boolean esNumero(String dato){
        try{
            int num = Integer.parseInt(dato); //Si puede convertirse es un número, si no se puede pues no lo es.
        }
        catch(NumberFormatException e){
            return false; //Retorna false si no puede convertirse a número.
        }
        return true;
    }
}  
