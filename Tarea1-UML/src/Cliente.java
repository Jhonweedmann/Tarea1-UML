import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    private OrdenCompra ordenCompra;
    private ArrayList <OrdenCompra> Lista;

    public Cliente(String nombre, String rut, Direccion direccion, OrdenCompra ordenCompra) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.ordenCompra = ordenCompra;
        Lista = new ArrayList<>();
        Lista.add(ordenCompra);
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
    public void addOrdenCompra(OrdenCompra OC){
        Lista.add(OC);
    }
    public String getLista(){
        String temp = " ";
        for(int i=0;i<Lista.size();i++){
            temp += Lista.get(i).toString();
            temp += "\n";
            //System.out.println();
        }
        return temp;
    }



    @Override
    public String toString() {
        if(Lista.size() == 1){
            return "Cliente{\n" +
                    "nombre= '" + nombre + '\'' + "\n" +
                    "rut= '" + rut + '\'' + "\n" +
                    "direccion= " + direccion.getDireccion() + "\n" +
                    "Orden de Compra= { \n" + getLista() + "\n" +
                    '}';
        }else{
            return "Cliente{\n" +
                    "nombre= '" + nombre + '\'' + "\n" +
                    "rut= '" + rut + '\'' + "\n" +
                    "direccion= " + direccion.getDireccion() + "\n" +
                    "Ordenes de Compra= { \n" + getLista() + "\n" +
                    '}';
        }
    }
/*
    public String nosexd(){
        ordenCompra.toString();
    }

 */
}
