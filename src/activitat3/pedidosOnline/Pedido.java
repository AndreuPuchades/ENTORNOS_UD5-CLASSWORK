package activitat3.pedidosOnline;

import java.util.ArrayList;

public class Pedido {
    private String nombreCliente;
    private String fecha;
    private float precio;
    private ArrayList<Producto> listaProductos;
    private MetodoPago metodoPago;

    public Pedido(String nombreCliente, String fecha, ArrayList<Producto> listaProductos,
                  MetodoPago metodoPago) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.precio = calcularPrecioTotal();
        this.listaProductos = listaProductos;
    }

    public void anyadirProducto(Producto producto){
        listaProductos.add(producto);
    }

    public float calcularPrecioTotal(){
        float precioTotal = 0;

        for (int i = 0; i < listaProductos.size(); i++) {
            precioTotal += listaProductos.get(i).calcularPrecioTotal();
        }

        return precioTotal;
    }

    public void anyadirMetodoPago(MetodoPago metodoPago){
        this.metodoPago = metodoPago;
    }
}