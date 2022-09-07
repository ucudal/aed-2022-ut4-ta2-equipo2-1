
import java.util.ArrayList;



/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listaLineasArchivo = new ArrayList<String>();
        TArbolBB arbol =  new TArbolBB();
        String[] str = ManejadorArchivosGenerico.leerArchivo("src\\claves1.txt");
        for (String c : str){
            TElementoAB elem = new TElementoAB(c,"");
            arbol.insertar(elem);
            listaLineasArchivo.add(c + " " + TElementoAB.counter) ;
            System.out.println(c);
        }
        ManejadorArchivosGenerico.escribirArchivo("src\\counter.txt", listaLineasArchivo.toArray(new String [0]));
    }
    
}
