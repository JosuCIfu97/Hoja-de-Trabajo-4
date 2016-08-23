
import java.util.ArrayList;

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
public class AStack<E> extends AbstractStack<E> {
   
    /**
     *
     */
    protected ArrayList<E> datos;
    
    /**
     *Constructor
     */
    public AStack(){
        datos = new ArrayList<>();
    }
    
    @Override
    public  void push(E valor){
        datos.add(valor);
    }

    
    @Override
    public E pop(){
        return datos.remove(datos.size()-1);
    }
}
