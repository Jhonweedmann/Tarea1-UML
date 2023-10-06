import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();

        Articulo a = new Articulo(50, "Bepsi","Una bebida",500 );
        Articulo b = new Articulo(200, "Lava-Dora","Soy el mapa, soy el mapa",7000 );
        Articulo articulo3 = new Articulo(0,"Cocina PesoPluma", "No pesa nada", 50);
        Articulo articulo4 = new Articulo(12, "Jugo de madera", "Madera con agua, jugo de madera", 45);
        Articulo articulo5 = new Articulo(5, "lapiz sin tinta", "Si tiene tinta, solo tienes que escribir con fuerza", 5);

        DetalleOrden d = new DetalleOrden(a,7);
        DetalleOrden c = new DetalleOrden(b,3);
        DetalleOrden f = new DetalleOrden(articulo3,10);
        DetalleOrden detalleOrden4 = new DetalleOrden(articulo5, 4);
        DetalleOrden detalleOrden5 = new DetalleOrden(articulo4, 4);

        Efectivo efectivo = new Efectivo(10000,date);
        Efectivo efectivo2 = new Efectivo(999999,date);

        Boleta Bo = new Boleta();
        Bo.setNumero("233");
        Bo.setFecha(date);
        Bo.setRut("21.001.001-K");
        Factura factura = new Factura();
        factura.setNumero("1293809");
        factura.setFecha(date);
        factura.setRut("4.893.245-k");

        OrdenCompra Pedido1 = new OrdenCompra(d,date,efectivo,Bo);
        //Se pueden agregar más de un DetalleOrden a una OrdenCompra
        Pedido1.addDetalleOrden(c);
        Pedido1.addDetalleOrden(f);

        //Se puede "agregar" dinero a una cuenta en diferentes montos dependiendo de la instancia
        Pedido1.addPago(efectivo);
        Pedido1.addPago(efectivo);
        Pedido1.addPago(efectivo);




        Tarjeta tarjeta = new Tarjeta(3500, date, "Tarjeta de credito con 100%de interes", "#42069");
        Transferencia transferencia = new Transferencia(6500, date, "Banko","#69420");
        OrdenCompra Pedido2 = new OrdenCompra(c,date,tarjeta,factura);
        OrdenCompra Pedido3 = new OrdenCompra(d,date, transferencia,Bo);
        OrdenCompra Pedido4 = new OrdenCompra(detalleOrden4,date,efectivo2,factura);




        Direccion direccion = new Direccion("P Sherman calle Wallaby 42 Sidney");
        Cliente Cli = new Cliente("Juan el curioso", "22222",direccion, Pedido1);
        Cli.setRut("21.001.001-K");
        Cli.setNombre("jorge el curioso");
        Cli.addOrdenCompra(Pedido2);
        Cli.addOrdenCompra(Pedido3);
        System.out.println(Cli.toString());

        System.out.println("Vuelto de compra con efectivo de primer cliente: "+efectivo.calcDevolucion(Pedido1.getPagos(),Pedido1.calcPrecio())+ "\n");


        Direccion direccion2 = new Direccion("Macedonia del 325 a.c.");
        Cliente cliente2 = new Cliente("Big Alejandro","0.000.000-1", direccion2,Pedido4);
        cliente2.addOrdenCompra(Pedido2);
        System.out.println(cliente2);
        System.out.println("Vuelto de compra con efectivo de segundo cliente: "+efectivo2.calcDevolucion(Pedido4.getPagos(),Pedido4.calcPrecio())+ "\n");



    }
}
