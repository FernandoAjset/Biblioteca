package gt.com.itxpert.peliculas.servicio;

/**
 *
 * @author ferajset
 */
public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "/home/ferajset/Programacion/FicherosCreados/peliculas.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPeliculas(String buscar);

    void iniciarCatalogoPeliculas();
}
