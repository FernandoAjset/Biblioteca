package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1 de la semana: "+Dias.LUNES);
//        System.out.println("Dia 2 de la semana: "+Dias.MARTES);
//        
//        indicarDia(Dias.DOMINGO);

        System.out.println("Continente No. 4: "+ Continentes.AMERICA);
        System.out.println("Paises en el continente 4: "+Continentes.AMERICA.getPaises());
        
        System.out.println("Continente No. 1: "+ Continentes.AFRICA);
        System.out.println("Paises en el continente 4: "+Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDia(Dias dias){
        switch(dias){
            case LUNES: System.out.println("Dia 1");
            break;
            case MARTES: System.out.println("Dia 2");
            break;
            case MIERCOLES: System.out.println("Dia 3");
            break;
            case JUEVES: System.out.println("Dia 4");
            break;
            case VIERNES: System.out.println("Dia 5");
            break;
            case SABADO: System.out.println("Dia 6");
            break;
            default: System.out.println("DIA INCORRECTO");
            break;
        }
    }
}
