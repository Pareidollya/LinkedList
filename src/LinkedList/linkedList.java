
package LinkedList;

/**
 *
 * @author jj
 */
public class linkedList <T>{
    private Cell first;
    private Cell last;
    private int elementos;

    public linkedList() {
        this.first = null;
        this.last = null;
        this.elementos = 0;
    }

    public Cell getFirst() {
        return first;
    }

    public Cell getLast() {
        return last;
    }

    public int tamanho() {
        return elementos;
    }
    
    public void adiciona(int pos, cavalo elemento){
        //tratar
        Iterador it = new Iterador(this.first);
        int i = 0;
        
        while (it.hasNext()){
            if (i != (pos - 1)){
                it.next();
                i++;
            }
            else{
                Cell nova = new Cell(it.getAtual().getProxima(),elemento);
                System.out.println(elemento.getCavalo() + " Adicionado como proximo de "+ it.getAtual().getElemento().getCavalo()+ 
                        " proximo: " + it.getAtual().getProxima().getElemento().getCavalo());
                
                it.getAtual().setProxima(nova);
                this.elementos++;
                break;
            }
        }
    }
    public void adicionaFirst(cavalo elemento){
        Cell nova = new Cell(this.first,elemento);
        
        if (this.elementos == 0){
            this.first = this.last = nova;
            this.elementos++;
            System.out.println(nova.getElemento().getCavalo() +" Adicionado no inicio, sua proxima é: " + nova.getProxima());
        }
        else{
            nova.setProxima(first); //a celula do inicio torna-se a proxima da nova adicionada
            this.first = nova;
            this.elementos++;
            System.out.println(nova.getElemento().getCavalo() +" Adicionado no inicio, sua proxima é: " + nova.getProxima().getElemento().getCavalo());
        }      
    }
  
    public void adicionLast(cavalo elemento){
        Cell nova = new Cell(null,elemento); //proximo do ultimo = null
        
        if (this.elementos == 0){
            this.first = this.last = nova;
            System.out.println("add final");
            this.elementos++;
            }
        
        else{
            this.last.setProxima(nova);
            this.last = nova;
            System.out.println(nova.getElemento().getCavalo() +" adicionado no final, seu proximo é:  " + nova.getProxima());
            this.elementos++;
        }
    }
    public void remove(int pos){
        //tratar
        Iterador it = new Iterador(this.first);
        
        if (pos == 0)
            this.removeInicio();
        int i = 0;
        
        while (it.hasNext()){
            if (i != (pos - 1)){
                it.next();
                i++;
            }
            else{
                 System.out.println(it.getAtual().getProxima().getElemento().getCavalo() + 
                         " Removido, proximo: "+ it.getAtual().getProxima().getProxima().getElemento().getCavalo());
                it.getAtual().setProxima(it.getAtual().getProxima().getProxima());
                this.elementos--;
                break;
                
            }
        
        }
    }
    public void removeInicio(){
        if(this.elementos == 0){
            System.out.println("Lista vazia!");
        }
        else if(this.first == this.last){ 
            this.first = this.last = null;
            this.elementos--;
        }
        else{
            System.out.println(this.first.getElemento().getCavalo() + " Removido do inicio");
            this.first = first.getProxima();
            this.elementos--;
        }
        
    }
    
    public void removeFim(){
          if(this.elementos == 0){
            System.out.println("Lista vazia!");
        }
        else if(this.first == this.last){ 
            this.first = this.last = null;
            this.elementos--;
            }
          
        Iterador it = new Iterador(this.first);
        
        while(it.hasNext()){
            if(it.getAtual().getProxima().getProxima() == null){
                System.out.println(it.getAtual().getProxima().getElemento().getCavalo() + " Removido");
                it.getAtual().setProxima(null);
                this.last = null;
                this.last = it.getAtual();
                
                this.elementos--;
                
            }
            it.next();
        }
    }
    
    public T recupera(int pos){
        if (this.elementos == 0){
            // tratar
            return null;
        }
        else if (pos < 0 || pos >= this.elementos){
            return null;
        }
        else{
            Iterador it = new Iterador(this.first);
            int i = 0;
            while(it.hasNext()){
                if (i != pos){
                    it.next();
                    i++;
                }
                else{
                    break;
                }
            }
            return (T) it.getAtual().getElemento().getCavalo();
        }   
    }
    
    public boolean existeDados(Object elemento){
        Iterador it = new Iterador(this.first);
        
         while(it.hasNext()){
             System.out.println(it.getAtual());
             if (it.getAtual().getElemento().equals(elemento) == true){
                 return true;       
            }
             it.next();                
        }
         return false;
    }
    
    public void printList(){
        Iterador it = new Iterador(this.first);
        System.out.println("\nprint lista");
        while (it.hasNext()){
            System.out.println(it.getAtual().getElemento().getCavalo() + " Seu proximo é " + it.getAtual().getProxima());
            it.next();
             
        }
    }
    
    public void limpaChat(){
        Iterador it = new Iterador(this.first);
        int i = 0;
        while(it.hasNext()){
            if (i != this.elementos){
            it.getAtual().setElemento(null);
            i++;
            it.next();
        }
            else{
                break;
            }             
    }
        this.first = this.last = null;
        System.out.println("limpo");
    }
}