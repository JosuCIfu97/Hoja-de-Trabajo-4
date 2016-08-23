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
public class StackFactory<E> {

    /**
     *
     * @param entry
     * @return
     */
    public AbstractStack<E> getStack(String entry){
        if (entry.equals("1")) //Si el usuario escogió 1, se utilizará un ArrayList.
            return new AStack<E>();
        else if (entry.equals("2")) //Si el usuario escogió 2, se utilizará un Vector.
            return new VStack<E>();
        else //Si el usuario escogió 3, se utilizará una Lista Simplemente Enlazada.
            return new LStack<E>();
    }
}
