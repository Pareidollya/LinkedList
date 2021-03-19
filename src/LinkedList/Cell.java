package LinkedList;

/**
 *
 * @author jj
 */
public class Cell <T>{
    private Cell proxima;
    private Cell anterior;
    private cavalo elemento; //mudar pra T
    

    public Cell(Cell proxima,Cell anterior, cavalo elemento) {
        this.proxima = proxima;
        this.anterior = anterior;
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

    public Cell getAnterior() {
        return anterior;
    }

    public void setAnterior(Cell anterior) {
        this.anterior = anterior;
    }
    
    public cavalo getElemento() { //mudar pra T
        return elemento;
    }

        public void setElemento(cavalo elemento) { //mudar pra T
        this.elemento = elemento;
    }
    
    
    
    
}
