package excepciones;

/**
 *
 * @author ferna
 */
public class OperacionExcepcion extends RuntimeException{
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
