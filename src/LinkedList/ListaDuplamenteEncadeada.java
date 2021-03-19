
package LinkedList;

/**
 *
 * @author jj
 */
//remover iterações 
public class ListaDuplamenteEncadeada <T>{
    private Cell first;
    private Cell last;
    private Cell cabeça;
    private int elementos;

    public ListaDuplamenteEncadeada(T Nó_cabeça) {
        this.first = null;
        this.last = null;
        this.elementos = 0;
        this.cabeça = new Cell(this.first,this.last,Nó_cabeça);
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

    public Cell getCabeça() {
        return cabeça;
    }
    
    
    public void adiciona(int pos, T elemento){
        this.VerificarPosição(pos);
        
        if(pos == 0) pos = pos+1;
        Iterador it = new Iterador(this.first);     
        int i = 0;  
        while (it.hasNext()){
            if (i != (pos - 1)){
                it.next();
                i++;
            }
            else{
                Cell nova = new Cell(it.getAtual().getProxima(),it.getAtual(),elemento);  
                System.out.println(nova + " Adicionado, anterior:" + nova.getAnterior()+", proximo: "+nova.getProxima()); 
                
                it.getAtual().getProxima().setAnterior(nova); //atualiza o anterior do proximo 
                it.getAtual().setProxima(nova);
                this.elementos++;
                break;
            }
        }
         
    }
    public void adicionaInicio(T elemento){
        Cell nova = new Cell(this.first,this.cabeça,elemento);
        
        if (this.elementos == 0){
            this.first = this.last = nova;
            this.first.setProxima(this.cabeça);
            this.cabeça.setProxima(nova);
            this.cabeça.setAnterior(nova);
            this.elementos++;
            
            System.out.println(nova+" add inicio, anterior: "+ nova.getAnterior() + ", proxima: " + nova.getProxima());
        }
        else{
            nova.setProxima(first); //a celula do inicio torna-se a proxima da nova adicionada
            nova.getProxima().setAnterior(nova);//a atual se torna anterior da nova proxima 
            
            this.first = nova;
            this.cabeça.setProxima(this.first);
            this.elementos++;
            
            System.out.println(nova+" add inicio, anterior: "+ nova.getAnterior()+ ", proxima: " + nova.getProxima());
        }      
    }
  
    public void adicionaFim(T elemento){
        Cell nova = new Cell(this.cabeça,this.last,elemento); //proximo do ultimo = head
        
        if (this.elementos == 0){
            this.first = this.last = nova;
            this.last.setAnterior(this.cabeça);
            this.cabeça.setAnterior(this.last);
            this.cabeça.setProxima(nova);
            this.elementos++;
            
            System.out.println("add final");
            }
        
        else{
            this.last.setProxima(nova);
            this.last.setAnterior(this.anterior(this.last));
            this.last = nova;
            this.cabeça.setAnterior(this.last);
            this.elementos++;
            
            System.out.println(nova+" add final, anterior: "+nova.getAnterior()+", proximo:  " + nova.getProxima());
        }
    }
    
    public void remove(int pos){
        this.VerificarPosição(pos);
        Iterador it = new Iterador(this.first);
        
        if (pos == 0){
            this.removeInicio();
        }
        else if (pos == this.elementos - 1){
            this.removeFim();
        }
        else{
        int i = 0;
        while (it.hasNext()){
            if (i != (pos - 1)){
                it.next();
                i++;
            }
            else{
                 System.out.println("\n"+it.getAtual().getProxima()+" Removido");        
                 
                it.getAtual().getProxima().setAnterior(it.getAtual());
                it.getAtual().setProxima(it.getAtual().getProxima().getProxima()); 
                
                this.elementos--;
                break;  
            }     
        }            
        }    
    }
    public void removeInicio(){
        if(this.elementos == 0){
            System.out.println("Lista vazia!");
        }
        
        else if(this.first == this.last){ 
            this.first = this.last = null;
            this.cabeça.setAnterior(this.last);
            this.cabeça.setProxima(this.first);
            this.elementos--;
        }
        else{
            System.out.println(this.first.getElemento()+ " Removido");
            
            this.first = first.getProxima();
            this.first.setAnterior(this.cabeça);
            this.cabeça.setProxima(this.first);
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
            if(it.getAtual().getProxima().getProxima() == this.cabeça){
                System.out.println(it.getAtual().getProxima() + " Removido");        
                it.getAtual().setProxima(this.cabeça);
                this.last = null;
                this.last = it.getAtual();
                this.last.setAnterior(this.anterior(it.getAtual()));   
                this.last.setProxima(this.cabeça);
                this.cabeça.setAnterior(this.last);
                this.elementos--;
                break;
            }

            it.next();
        }
    }
    public T recupera(int pos){
        this.Vazia();
        this.VerificarPosição(pos);
        
        if (this.elementos == 0){
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
            return (T) it.getAtual().getElemento();
        }   
    }
    
    public boolean existeDado(T elemento){
        this.Vazia();
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
    
    public void print(){
        Iterador it = new Iterador(this.first);
        System.out.println("\nprint lista");
        while (it.hasNext()){
            System.out.println(it.getAtual()+", anterior: "+it.getAtual().getAnterior() +", proximo: " + it.getAtual().getProxima());
            it.next();
            if (it.getAtual().equals(this.cabeça)){
                System.out.println("Head: "+ it.getAtual()+", anterior: "
                        +it.getAtual().getAnterior() +", proximo: " + it.getAtual().getProxima());
                break;
            }
            
             
        }
        if (this.elementos==0)System.out.println("Head: "+ this.cabeça+", anterior: "
                        +this.cabeça.getAnterior() +", proximo: " + this.cabeça.getProxima());
    }
    
    public void limpa(){
        this.Vazia();
        
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
    
    private void Vazia(){
        if (this.elementos == 0){
            System.out.println("A lsita está vazia");
        }
    }
   
    private void VerificarPosição(int pos){
        if (pos>=this.elementos){
            throw new IllegalArgumentException("Posição invalida!");
        }
       else if (pos < 0){
           throw new IllegalArgumentException("Posição invalida!");
       }
    }
    
    private Cell anterior(Cell elemento){ //retorna o elemento anterior do citado 
        Iterador it = new Iterador(this.first);
        
        while(it.hasNext()){
            if (it.getAtual().getProxima().equals(elemento) == true){
                break;
            }
            else{
                it.next();
            }       
        }
        return it.getAtual();
        
    }
            
}