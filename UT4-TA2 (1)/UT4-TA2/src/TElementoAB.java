public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;
    public static int counter = 0;
    public static String recorrido = "";
    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return 
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    @Override
    public Comparable getEtiqueta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if (this.etiqueta.compareTo(elemento.etiqueta) == 0 ){
            return false;
        }
        if (elemento.etiqueta.compareTo(this.etiqueta) < 0){
            if (this.hijoIzq == null){
                this.hijoIzq = elemento;
            }else{
                this.hijoIzq.insertar(elemento);
            }
            return true;
        }else{
            if (this.hijoDer == null){
                this.hijoDer = elemento;
            }else{
                this.hijoDer.insertar(elemento);
            }
            return true;
        }
    }
    
    public boolean insertarCount(TElementoAB<T> elemento) {
        if (this.etiqueta.compareTo(elemento.etiqueta) == 0 ){
            return false;
        }
        if (elemento.etiqueta.compareTo(this.etiqueta) < 0){
            if (this.hijoIzq == null){
                this.hijoIzq = elemento;
            }else{
                this.hijoIzq.insertar(elemento);
            }
            counter++;
            return true;
        }else{
            if (this.hijoDer == null){
                this.hijoDer = elemento;
            }else{
                this.hijoDer.insertar(elemento);
            }
            counter++;
            return true;
        }
    }
    
    @Override
    public String preOrden() {
        recorrido += this.getEtiqueta();
        if(this.hijoIzq != null) {
            this.hijoIzq.preOrden();
        } else if(this.hijoDer != null) {
            this.hijoIzq.preOrden();
        }
        return recorrido;
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   	
}
