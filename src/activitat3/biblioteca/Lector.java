package activitat3.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Lector {
    private int codigoSocio;
    private String nombre;
    private String direccion;
    private String telefono;
    private Map<String, String> librosPrestados;
    private String fechaDeSancion;

    public Lector(String nombre, int codigoSocio, String direccion, String telefono) {
        this.nombre = nombre;
        this.codigoSocio = codigoSocio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.librosPrestados = new HashMap<>(3);
        this.fechaDeSancion = null;
    }

    public void anyadirLibroPrestado(Autor autor, String identificadorLibro, String fecha){
        if(fechaDeSancion != null){
            System.out.println("La cuenta esta bloqueada hasta " + fechaDeSancion);
            return;
        }

        if(librosPrestados.size() >= 3){
            System.out.println("Maximo puedes tener 3 libros prestados");
            return;
        }

        for (int i = 0; i < autor.getListaLibros().size(); i++) {
            if(autor.getListaLibros().get(i).getIdentificador().equals(identificadorLibro)){
                librosPrestados.put(identificadorLibro, fecha);
            }
        }
    }

    public void devolverLibroPrestado(String identificadorLibro){
        librosPrestados.remove(identificadorLibro);
    }
}