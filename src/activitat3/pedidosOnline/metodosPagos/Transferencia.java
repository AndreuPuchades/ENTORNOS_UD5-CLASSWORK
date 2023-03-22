package activitat3.pedidosOnline.metodosPagos;

import activitat3.pedidosOnline.MetodoPago;

public class Transferencia extends MetodoPago {
    private float divisa;
    public Transferencia(float precioPagar, String fechaVencimiento, float divisa) {
        super(precioPagar, fechaVencimiento);
        this.divisa = divisa;
    }
}