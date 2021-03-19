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
        cavalo cabeça = new cavalo("HeadC0");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada(cabeça);
        
        cavalo c1 = new cavalo("1");
        lista.adicionaFim(c1);

        System.out.println(lista.tamanho());    
        lista.print();
        
        cavalo c2 = new cavalo("2");
        lista.adicionaInicio(c2);
     
        System.out.println(lista.tamanho());
        lista.print();
        
        cavalo c3 = new cavalo("3");
        lista.adicionaFim(c3);
        
        //lista.removeInicio();
        //lista.removeFim();
        //lista.removeInicio();
        System.out.println(lista.tamanho());
        lista.print();
    }
    
}
