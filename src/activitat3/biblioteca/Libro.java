package activitat3.biblioteca;

import activitat3.biblioteca.enums.Estado;

public class Libro {
    private String identificador;
    private String titulo;
    private String ISBN;
    private Estado estado;

    public Libro(String identificador, String titulo, String ISBN) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.estado = Estado.DISPONIBLE;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getIdentificador() {
        return identificador;
    }
}