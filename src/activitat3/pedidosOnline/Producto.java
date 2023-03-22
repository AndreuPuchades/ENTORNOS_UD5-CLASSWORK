package activitat3.pedidosOnline;

public class Producto {
    private int unidadesDisponibles;
    private float precio;
    private float impuesto;
    private int numeroDeProductosPedidos;

    public Producto(int unidadesDisponibles, float precio, float impuesto, int numeroDeProductosPedidos) {
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
        this.impuesto = impuesto;
        this.numeroDeProductosPedidos = numeroDeProductosPedidos;
    }

    public float calcularPrecioTotal(){
        return precio * (1 + (impuesto / 100));
    }
}