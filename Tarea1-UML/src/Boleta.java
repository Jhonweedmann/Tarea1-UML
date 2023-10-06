import java.util.Date;

public class Boleta extends DocTributario {
    public Boleta() {
        super();
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "numero='" + numero + '\'' +
                ", rut='" + rut + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
