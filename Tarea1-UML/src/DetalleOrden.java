public class DetalleOrden {
    private Articulo a = new Articulo();
    private float IVA = (a.getPrecio()*19)/100;
    public DetalleOrden(){
    }
    public float calcPrecio(){

        return (a.getPrecio() + IVA);
    }
    public float calcPrecioSinIVA(){
        return a.getPrecio();
    }
    public float calcIVA(){
        return IVA;
    }
    public int calcPeso(){
        return 0;
    }
}
