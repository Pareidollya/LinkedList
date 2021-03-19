package LinkedList;

/**
 *
 * @author jj
 */
public class Cell <T>{
    private Cell proxima;
    private Cell anterior;
    private T elemento; 
    

    public Cell(Cell proxima,Cell anterior, T elemento) {
        this.proxima = proxima;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    public Cell (T elemento){ //primeiroa
        this.elemento = elemento;
    }

    public Cell getProxima() {
        return proxima;
    }

    public void setProxima(Cell proxima) {
        this.proxima = proxima;
    }

    public Cell getAnterior() {
        return anterior;
    }

    public void setAnterior(Cell anterior) {
        this.anterior = anterior;
    }
    
    public T getElemento() { 
        return elemento;
    }

        public void setElemento(T elemento) { 
        this.elemento = elemento;
    }
    
    
    
    
}
