import java.util.Date;

public class Factura extends DocTributario{
    public Factura() {
        super();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numero='" + numero + '\'' +
                ", rut='" + rut + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
