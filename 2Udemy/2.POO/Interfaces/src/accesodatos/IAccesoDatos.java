/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author ferajset
 */
public interface IAccesoDatos {
    int MAX_REGISTROS=10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
