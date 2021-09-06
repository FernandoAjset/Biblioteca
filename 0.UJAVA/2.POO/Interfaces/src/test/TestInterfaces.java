package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

/**
 *
 * @author ferajset
 */
public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        
//        datos.listar();
//        datos=new ImplementacionOracle();
//        datos.listar();
        
        imprimir(datos);
        datos= new ImplementacionOracle();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
