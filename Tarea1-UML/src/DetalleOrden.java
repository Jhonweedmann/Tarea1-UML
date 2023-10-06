public class DetalleOrden {

    private Articulo a;

    private int cantidad;
    public DetalleOrden(Articulo a, int cantidad) {
        this.a = a;
        this.cantidad = cantidad;
        //OrdenCompra o;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float calcPrecio(){

        return ((a.getPrecio() + ((a.getPrecio()*19)/100)))*cantidad;
    }
    public float calcPrecioSinIVA(){
        return (a.getPrecio())*cantidad;
    }
    public float calcIVA(){
        return ((a.getPrecio()*19)/100)*cantidad;
    }
    public float calcPeso(){
        return a.getPeso();
    }

    @Override
    public String toString() {
        return "\t DetalleOrden{" +
                " " + a.toString() +
                ", cantidad= " + cantidad +
                '}';
    }
}
