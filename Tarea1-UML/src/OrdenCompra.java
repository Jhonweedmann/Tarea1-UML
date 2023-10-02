import java.util.Date;

public class OrdenCompra {
    DetalleOrden DO;
    private Date fecha;
    private String estado;
    public OrdenCompra(){
        DO = new DetalleOrden();
    }
    public int calcPrecioSinIVA(){
    return 0;
    }
    public float calcIVA(){
        return DO.calcIVA();
    }
    public float calcPrecio(){
        return DO.calcPrecio();
    }
    public int calcPeso(){
        return DO.calcPeso();
    }

}
