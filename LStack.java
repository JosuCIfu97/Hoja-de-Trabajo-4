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
 * @param <E>
 */
public class LStack<E> extends AbstractStack<E> {
    
    /**
     *
     */
    protected Nodo<E> head;
    
    /**
     *
     */
    public LStack(){
        head = null;
    }
    
    /**
     *
     * @param info
     */
    public LStack(E info){
        head.setInfo(info);
        head = null;
    }
    
    @Override
    public void push(E valor){
        if (head == null)
            head = new Nodo(valor); //Si no hay cabeza, crea una.
        else{
            Nodo<E> temporal = head;
            while (temporal.getNext() != null)
                temporal = temporal.getNext(); //Si hay cabeza, recorre cada nodo hasta encontrar uno vacío e ingresar el valor allí.
            Nodo<E> next = new Nodo(valor);
            temporal.setNext(next);
        }
    }
    
    @Override
    public E pop(){
        int len = length(); //Obtiene la longitud de la lista.
        if (len == 1){ //Si solo hay un elemento en la lista, devuelve el valor de dicho Nodo y lo elimina.
            E resultado = head.getInfo();
            head = null;
            return resultado;
        }
        Nodo<E> temporal = head;
        int cont = 2; //Deben omitirse los casos en los que hay cero nodos o solo existe la cabeza y empezar uno después para obtener el penúltimo nodo.
        while (temporal.getNext() != null && cont < len){
            temporal = temporal.getNext(); //Se recorren los nodos hasta llegar al penúltimo de la lista.
            cont++;
        }
        Nodo<E> nResultado = temporal.getNext(); //Se obtiene el siguiente del penúltimo; es decir, el último.
        E resultado = nResultado.getInfo(); //Se obtiene el valor del último nodo.
        temporal.setNext(null); //Se elimina el puntero hacia dicho último nodo.
        return resultado; //Se devuelve el valor del último nodo.
    }
    
    /**
     *
     * @return
     */
    public int length(){
        Nodo<E> temporal = head;
        if (temporal == null) {
            return 0; //Si no hay cabeza, la lista no tiene largo alguno.
        }
        int cont = 1; //Inicia en 1 porque la cabeza ya se toma en cuenta.
        while (temporal.getNext() != null){
            temporal = temporal.getNext(); //Cuenta hasta que el siguiente sea null y devuelve dicho conteo.
            cont++;
        }
        return cont;
    }
    
    
}
