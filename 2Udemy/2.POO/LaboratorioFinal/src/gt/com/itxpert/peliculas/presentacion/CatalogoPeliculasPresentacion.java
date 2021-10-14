package gt.com.itxpert.peliculas.presentacion;

import gt.com.itxpert.peliculas.servicio.*;
import java.util.Scanner;

/**
 *
 * @author ferajset
 */
public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar Catologo de Peliculas\n"
                    + "2. Agregar Pelicula\n"
                    + "3. Listar Peliculas\n"
                    + "4. Buscar Pelicula\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                   //System.out.println("Se ha creado el archivo");
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula: ");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de una pelicula a buscar: ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

}
