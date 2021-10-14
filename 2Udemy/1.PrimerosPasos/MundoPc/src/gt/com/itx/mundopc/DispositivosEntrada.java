
package gt.com.itx.mundopc;

public class DispositivosEntrada {
    private String tipoDeEntrada;
    private String marca;
    
    public DispositivosEntrada(String tipoEntrada, String marca){
        this.tipoDeEntrada=tipoEntrada;
        this.marca=marca;
    }

    public String getTipoDeEntrada() {
        return this.tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivosEntrada{" + "tipoDeEntrada=" + tipoDeEntrada + ", marca=" + marca + '}';
    }
    
}
