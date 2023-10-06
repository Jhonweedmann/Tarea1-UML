import java.util.Date;

public class Efectivo extends Pago {
    float monto;
    public Efectivo(float monto, Date fecha) {
        super(monto, fecha);
        fecha = new Date();
        this.monto = monto;
    }
    public float calcDevolucion(float x, float y){
        return x - y;
    }

    @Override
    public String toString() {
        return "Efectivo{" +
                "monto=" + monto +
                //"fecha= " + fecha;
                '}';
    }
}
