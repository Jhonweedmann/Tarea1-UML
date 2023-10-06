import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private DetalleOrden DO;
    private Articulo articulo;

    private Date fecha;

    private String estado;
    private ArrayList<DetalleOrden> Lista;

    private DocTributario docTributario;
    private Pago pago;
    private ArrayList <Pago> ListaPagos;
    private Efectivo efectivo;
    private float PagoTotal=0;

    /* El constructor acepta un Detalle de orden y lo agregará automaticamente al ArrayList de DetalleOrden. Si se quieren agregar más de uno se tiene que ocupar el metodo "addDetalleOrden"
    */
    public OrdenCompra(DetalleOrden DO, Date fecha, Pago pago) {
        this.DO = DO;
        this.fecha = fecha;
        this.pago = pago;
        Lista = new ArrayList<>();
        Lista.add(DO);
        ListaPagos = new ArrayList<>();
        ListaPagos.add(pago);
    }

    public void addDetalleOrden(DetalleOrden DO2){
        Lista.add(DO2);
    }
    public void addPago(Pago pago02){ ListaPagos.add(pago02);}
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

    public String getLista(){
        String temp = " ";
        for(int i=0;i<Lista.size();i++){
            temp += Lista.get(i).toString();
            temp += "\n";
            //System.out.println();
        }
        return temp;
    }
    public float getPagos(){
        float sum = 0;
        //if(ListaPagos.get(0) == pago)
        for(int i=0; i<ListaPagos.size();i++){
             sum += ListaPagos.get(i).getMonto();
        }
        return sum;
    }

    public String getEstado(){
        if(calcPrecio() > getPagos()){
            return "Pago incompleto, falta saldo";
        }else if(calcPrecio() == getPagos()){
            return "Pago completado exitosamente.";
        }
        return"Pago completado exitosamente";
    }
/*
    public String infoPago(){
        for(Efectivo efectivo1 : ListaPagos)
        if(ListaPagos.getClass() == Efectivo.class.isInstance(efectivo)){

            return "Pagado con una: ";

        }
        return "xddd"
    }

 */


    @Override
    public String toString() {
        return " " +
                //"DO=" + DO +
                //", articulo=" + articulo +
                //", fecha=" + fecha.toString() +


                "Orden de Compra: \n" + getLista() +
                "\t CosteTotal: " + calcPrecio()+ "\n" +
                //"docTributario=" + docTributario +
                "\tpago: " + getPagos() + pago.toString() +"\n" +
                "\testado='" + getEstado() + '\'' +
                "\t"+'}';
    }
}
