package LinkedList;

/**
 *
 * @author jj
 */
public class Cell <T>{
    private Cell proxima;
    private cavalo elemento;
    

    public Cell(Cell proxima, cavalo elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    public Cell (cavalo elemento){ //primeiroa
        this.elemento = elemento;
    }

    public Cell getProxima() {
        return proxima;
    }

    public void setProxima(Cell proxima) {
        this.proxima = proxima;
    }

    public cavalo getElemento() {
        return elemento;
    }

        public void setElemento(cavalo elemento) {
        this.elemento = elemento;
    }
    
    
    
    
}
