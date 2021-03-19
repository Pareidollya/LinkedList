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
public class main {

    public static void main(String[] args) {
        linkedList lista = new linkedList();
        
        cavalo c1 = new cavalo("1");
        lista.adicionaFirst(c1);
        
        cavalo c2 = new cavalo("2");
        lista.adicionaFirst(c2);
        
        cavalo c3 = new cavalo("3");
        lista.adiciona(1, c3);
        
        cavalo c4 = new cavalo("4");
        lista.adicionLast(c4);
         
        System.out.println(lista.tamanho());    
        lista.printList();
        
        lista.remove(0);
        System.out.println(lista.tamanho());    
        lista.printList();
    }
    
}
