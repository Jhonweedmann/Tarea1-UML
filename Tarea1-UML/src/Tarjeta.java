import java.util.Date;

public class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto, Date fecha, String tipo, String numTransaccion) {
        super(monto, fecha);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}
