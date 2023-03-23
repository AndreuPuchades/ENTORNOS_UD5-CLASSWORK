package activitat3.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lector {
    final static int MAXIMO_DE_LIBROS_PRESTADO = 3;
    private int codigoSocio;
    private String nombre;
    private String direccion;
    private String telefono;
    private Map<Ejemplar, Prestamo> librosPrestados;
    private ArrayList<Sancion> sancions;

    public Lector(String nombre, int codigoSocio, String direccion, String telefono) {
        this.nombre = nombre;
        this.codigoSocio = codigoSocio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.librosPrestados = new HashMap<>();
        this.sancions = new ArrayList<>();
    }

    public void anyadirLibroPrestado(Autor autor, Ejemplar ejemplar, Prestamo prestamo){
        if("fechaDeSancion" != null){
            System.out.println("La cuenta esta bloqueada hasta " + "fechaDeSancion");
            return;
        }

        if(librosPrestados.size() >= MAXIMO_DE_LIBROS_PRESTADO){
            System.out.println("Maximo puedes tener 3 libros prestados");
            return;
        }

        for (int i = 0; i < autor.getListaLibros().size(); i++) {
            if(autor.getListaLibros().get(i).getID().equals(ejemplar.getID())){
                librosPrestados.put(ejemplar, prestamo);
            }
        }
    }

    public void devolverLibroPrestado(String identificadorLibro){
        librosPrestados.remove(identificadorLibro);
    }
}