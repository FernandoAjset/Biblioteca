package gt.com.itxpert.peliculas.datos;

import gt.com.itxpert.peliculas.domain.Pelicula;
import gt.com.itxpert.peliculas.excepciones.*;
import java.util.List;

/**
 *
 * @author ferajset
 */
public interface IAccesoDatos { //solo se definen comportamientos, su implementación sera en otra clase para hacerlo
                               //mas generico y poder cambiar nuestra app a futuro. 

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRersuco) throws AccesoDatosEx;

}
