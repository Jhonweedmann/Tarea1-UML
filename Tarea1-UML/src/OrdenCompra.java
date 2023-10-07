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
    public OrdenCompra(DetalleOrden DO, Date fecha, Pago pago, DocTributario docTributario) {
        this.DO = DO;
        this.fecha = fecha;
        this.pago = pago;
        this.docTributario = docTributario;
        Lista = new ArrayList<>();
        Lista.add(DO);
        ListaPagos = new ArrayList<>();
        ListaPagos.add(pago);
    }

    //Nos permite agregar más de un DetalleOrden
    public void addDetalleOrden(DetalleOrden DO2){
        Lista.add(DO2);
    }
    //Nos permite agregar más de un Pago
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


    //Entrega el toString de todas los DetallesOrden asociados a este cliente
    public String getLista(){
        String temp = " ";
        for(int i=0;i<Lista.size();i++){
            temp += Lista.get(i).toString();
            temp += "\n";
            //System.out.println();
        }
        return temp;
    }


    //obtiene el monto de la lista de pagos
    public float getPagos(){
        float sum = 0;
        //if(ListaPagos.get(0) == pago)
        for(int i=0; i<ListaPagos.size();i++){
             sum += ListaPagos.get(i).getMonto();
        }
        return sum;
    }


    //Dice si el pago se pudo realizar o no dependiendo de la cantidad que se quiera ingresar de dinero, si cumple o no
    public String getEstado(){
        if(calcPrecio() > getPagos()){
            return "Pago incompleto, falta saldo";
        }else if(calcPrecio() == getPagos()){
            return "Pago completado exitosamente.";
        }
        return"Pago completado exitosamente";
    }


    @Override
    public String toString() {
        return " " +
                "Orden de Compra: \n" + getLista() +
                "\t CosteTotal: " + calcPrecio()+ "\n" +
                "\tdocTributario=" + docTributario.toString() + "\n" +
                "\tpago: " + getPagos() + pago.toString() +"\n" +
                "\testado='" + getEstado() + '\'' +
                "\t"+'}';
    }
}
