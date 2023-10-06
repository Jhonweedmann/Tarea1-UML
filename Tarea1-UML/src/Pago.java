import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    //private String tipoPago;

    public float getMonto() {
        return monto;
    }

    public Pago(float monto, Date fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }
    /*
    public String tipoPago(Efectivo efectivo){

    }

     */

    @Override
    public String toString() {
        return "Pago{" +
                "monto=" + monto +
                ", fecha=" + fecha +
                '}';
    }
}
