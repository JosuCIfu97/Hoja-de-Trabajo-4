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
 * @param <T>
 */
public class Nodo<T> {
    
    private T info;
    private Nodo next;
    
    /**
     *
     */
    public Nodo(){
        next = null;
    }
  
    /**
     *
     * @param info
     */
    public Nodo(T info){
        this.info = info;
        next = null;
    }
    
    /**
     *
     * @param info
     */
    public void setInfo(T info){
        this.info = info;
    }
    
    /**
     *
     * @return
     */
    public T getInfo(){
        return info;
    }  
    
    /**
     *
     * @param next
     */
    public void setNext(Nodo<T> next){
        this.next = next;
    }  

    /**
     *
     * @return
     */
    public Nodo<T> getNext(){
        return next;
    }
    
}
