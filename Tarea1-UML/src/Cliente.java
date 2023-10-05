import java.util.Date;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    private OrdenCompra ordenCompra;

    public Cliente(String nombre, String rut, Direccion direccion, OrdenCompra ordenCompra) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.ordenCompra = ordenCompra;
    }
/*
    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

 */

    public String getDireccion() {
        return direccion.getDireccion();
    }

    public void setRut(String rut) {

        this.rut = rut;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }



    @Override
    public String toString() {
        return "Cliente{\n" +
                "nombre= '" + nombre + '\'' + "\n" +
                "rut= '" + rut + '\'' + "\n" +
                "direccion= " + direccion.getDireccion() + "\n" +
                "ordenCompra= {" + ordenCompra.toString() + "\n" +
                '}';
    }
/*
    public String nosexd(){
        ordenCompra.toString();
    }

 */
}
