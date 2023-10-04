import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();

        Articulo a = new Articulo(50, "Bepsi","Una bebida",500 );
        DetalleOrden d = new DetalleOrden(a,7);
        DetalleOrden c = new DetalleOrden(a,3);
        DetalleOrden f = new DetalleOrden(a,10);
        OrdenCompra Pedido1 = new OrdenCompra(d);
        Pedido1.addDetalleOrden(c);
        Pedido1.addDetalleOrden(f);
        DocTributario doc = new DocTributario();
        Boleta Bo = new Boleta();
        Bo.setNumero("233");
        Bo.setFecha(date);
        Bo.setRut("21.516.739-K");
        System.out.println(Bo.toString());
        Cliente Cli = new Cliente();
        Cli.setRut("222222-2");
        Cli.setNombre("jorge el curioso");
        System.out.println(Cli.toString());


        System.out.println(Pedido1.calcPrecio());
        System.out.println(Pedido1.calcIVA());
        System.out.println(Pedido1.calcPrecioSinIVA());
        System.out.println(d.getCantidad());
    }
}
