package activitat3.biblioteca;
public class Prestamo {
    final static int DIES_SANCCIO = 30;
    private String fechaInicio;
    private String fechaFin;

    public Prestamo(String fechaInicio, String fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}