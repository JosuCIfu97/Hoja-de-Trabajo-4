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
 public abstract class AbstractStack<E> implements iStack<E> {

    @Override
    public abstract  void push(E valor);
    //pre: La pila está con n valores dentro.
    //post: Se mete el valor del parámetro hasta arriba en la pila.

    @Override
    public abstract E pop();
    //pre: La pila se encuentra con n>0 valores dentro.
    //post: Se saca el valor de hasta arriba de la pila.
    
}
