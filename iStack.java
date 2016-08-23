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
public interface iStack<E> {
     /**
     *Ingresa un valor hasta arriba en la pila.
     * @param valor
     */
    public void push(E valor);

    /**
     *Retorna el valor de hasta arriba de la pila y lo remueve de la misma.
     * @return
     */
    public E pop();
}
