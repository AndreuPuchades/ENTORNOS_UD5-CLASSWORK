package activitat3.pedidosOnline.metodosPagos;

import activitat3.pedidosOnline.MetodoPago;

public class TarjetaCredito extends MetodoPago {
    private long numeroTarjeta;
    private String fechaCaducidad;

    public TarjetaCredito(float precioPagar, String fechaVencimiento, long numeroTarjeta, String fechaCaducidad) {
        super(precioPagar, fechaVencimiento);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }
}