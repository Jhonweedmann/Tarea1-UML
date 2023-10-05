import java.util.Date;

public class Efectivo extends Pago {
    private float dinero;
    public Efectivo(int dinero, int monto, Date fecha) {
        super(monto, fecha);
        this.dinero = dinero;
    }

    public float calcDevolucion(){
        if(dinero != getMonto()){
            if(dinero < getMonto()){
                return 0;
            }
            if(dinero > getMonto()){
               dinero = dinero - getMonto();
               return dinero;
            }
        }
        return 0;
    }
}
