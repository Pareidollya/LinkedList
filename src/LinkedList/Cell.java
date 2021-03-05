package LinkedList;

/**
 *
 * @author jj
 */
public class Cell <T>{
    private Cell proxima;
    private T elemento;
    

    public Cell(Cell proxima, T elemento) {
        this.proxima = proxima;
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

    public T getElemento() {
        return elemento;
    }

        public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    
    
    
}
