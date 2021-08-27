package test;

import domain.*;

/**
 *
 * @author ferajset
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado=new Escritor("Juan Garcia Marquez",10000,TipoEscritura.CLASICO);
        
        System.out.println("empleado = " + empleado);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
//downcasting
    //primera opcion de conversión, envolviento todo en parentesis
        System.out.println("Tipo de escritura, opcion 1 = "+((Escritor)empleado).getTipoEscritura());
    //segunda opcion de conversión, asignando a una variable
        Escritor escritor= (Escritor) empleado;
        System.out.println("Tipo de escritura, opcion 2 = " + escritor.getTipoEscritura());

//upcasting no necesita conversión explicita
        Empleado empleado2=escritor; //Los tipos con mas bits soportan a los que tienen menos
                                     // pero no podré usar los metodos unicos de la clase hija
                                     // solo puedo acceder a los que tienen en común                            
    }
}
