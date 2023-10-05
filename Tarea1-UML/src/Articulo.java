public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;

    public Articulo(float peso, String nombre, String descrion, float precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descrion;
        this.precio = precio;
    }

    private float precio;

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescrion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre=" + nombre +
                ", peso'" + peso + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
