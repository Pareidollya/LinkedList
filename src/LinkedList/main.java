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
        lista.adicionaFirst(c3);
        
        cavalo c4 = new cavalo("4");
        lista.adicionLast(c4);
        
        cavalo c5 = new cavalo("5");
        lista.adicionLast(c5);
        
        cavalo c7 = new cavalo("7");
        
        System.out.println(lista.existeDados(c7));
        
        lista.printList();
        
        lista.adiciona(2, c7);
        
        //lista.removeFim();
        lista.remove(4);
        
        lista.printList();
        
        
        
        System.out.println(lista.tamanho());
        
       
     
    }
    
}
