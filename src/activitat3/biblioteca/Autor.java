package activitat3.biblioteca;

import java.util.ArrayList;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private String fechaDeNacimiento;
    private ArrayList<Libro> listaLibros;

    public Autor(String nombre, String nacionalidad, String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.listaLibros = new ArrayList<>();
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void anyadirLibro(String identificador, String titulo, String ISBN){
        Libro libroNuevo = new Libro(identificador, titulo, ISBN);

        if(comprobarSiHayUnLibroIgual(libroNuevo)){
            System.out.println("Ya esta añdadido este libro");
        } else {
            listaLibros.add(libroNuevo);
        }
    }

    private boolean comprobarSiHayUnLibroIgual(Libro libro){
        for (int i = 0; i < listaLibros.size(); i++) {
            if(listaLibros.get(i).equals(libro)){
                return true;
            }
        }

        return false;
    }
}