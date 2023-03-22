package activitat3.pedidosOnline.metodosPagos;

import activitat3.pedidosOnline.MetodoPago;

public class Cheque extends MetodoPago {
    private long numeroCheque;
    private String numeroCuenta;

    public Cheque(float precioPagar, String fechaVencimiento, long numeroCheque, String numeroCuenta) {
        super(precioPagar, fechaVencimiento);
        this.numeroCheque = numeroCheque;
        this.numeroCuenta = numeroCuenta;
    }
}