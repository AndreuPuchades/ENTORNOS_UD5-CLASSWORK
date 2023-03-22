package activitat3.pedidosOnline.metodosPagos;

import activitat3.pedidosOnline.MetodoPago;

public class Criptomoneda extends MetodoPago {
    private String cartera;
    public Criptomoneda(float precioPagar, String fechaVencimiento, String cartera) {
        super(precioPagar, fechaVencimiento);
        this.cartera = cartera;
    }
}
