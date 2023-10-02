public class DetalleOrden {
    private Articulo a = new Articulo();

    //private float IVA = (a.getPrecio()*19)/100;
    private int cantidad;
    public DetalleOrden(){
    }

    public float calcPrecio(){

        return (a.getPrecio() + ((a.getPrecio()*19)/100));
    }
    public float calcPrecioSinIVA(){
        return a.getPrecio();
    }
    public float calcIVA(){
        return (a.getPrecio()*19)/100;
    }
    public int calcPeso(){
        return 0;
    }
}
