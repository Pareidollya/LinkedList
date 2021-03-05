/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author jj
 */
import java.util.Iterator;

public class Iterador<T> implements Iterator{

    private Cell atual;

    public Iterador(Cell atual) {
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext() {
        if(atual != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        T elemento = (T) atual.getElemento();
        atual = atual.getProxima();
        return elemento;
    }

    public Cell getAtual() {
        return atual;
    }
}
