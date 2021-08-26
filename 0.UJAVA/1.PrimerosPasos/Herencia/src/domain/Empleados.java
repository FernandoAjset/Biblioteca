
package domain;

public class Empleados extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleados(){
        //super();
        this.idEmpleado=++Empleados.contadorEmpleado;
    }
    
    public Empleados(String nombre, double sueldo) {
        //super(nombre);
        this();
        this.nombre=nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString()).append(")");
        sb.append('}');
        return sb.toString();
    }
}
