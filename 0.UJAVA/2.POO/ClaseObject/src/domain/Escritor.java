package domain;

/**
 *
 * @author ferajset
 */
public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" +super.toString()+"tipoEscritura=" + tipoEscritura + '}';
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
