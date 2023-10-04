import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private DetalleOrden DO;
    private Articulo articulo;

    private Date fecha;

    private String estado;
    private ArrayList<DetalleOrden> Lista;
    /* El constructor acepta un Detalle de orden y lo agregará automaticamente al ArrayList de DetalleOrden. Si se quieren agregar más de uno se tiene que ocupar el metodo "addDetalleOrden"
    */
    public OrdenCompra(DetalleOrden DO) {
        this.DO = DO;
        Lista = new ArrayList<>();
        Lista.add(DO);
    }

    public void addDetalleOrden(DetalleOrden DO2){
        Lista.add(DO2);
    }
    public float calcPrecioSinIVA(){
        int sum = 0;
        for(int i=0;i<Lista.size(); i++){
            sum += Lista.get(i).calcPrecioSinIVA();
        }
    return sum;
    }
    public float calcIVA(){
        int sum = 0;
        for(int i=0;i<Lista.size();i++){
            sum += Lista.get(i).calcIVA();
        }
        return sum;
    }
    public float calcPrecio(){
        int sum = 0;
        for(int i=0;i<Lista.size();i++){
            sum += Lista.get(i).calcPrecio();
        }
        return sum;
    }
    public float calcPeso(){
        int sum = 0;
        for(int i=0;i<Lista.size();i++){
            sum += Lista.get(i).calcPeso();
        }
        return sum;
    }

}
