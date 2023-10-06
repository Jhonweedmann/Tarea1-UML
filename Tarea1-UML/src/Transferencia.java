import java.util.Date;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(float monto, Date fecha, String banco, String numCuenta) {
        super(monto, fecha);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return " con Transferencia{" +
                "banco='" + banco + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                '}';
    }
}
