package activitat3.biblioteca;

import activitat3.biblioteca.enums.Estado;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Autor> listaAutores;

    public Biblioteca(){
        this.listaAutores = new ArrayList<>();
    }

    public void anyadirAutor(String nombre, String nacionalidad, String fechaDeNacimiento){
        Autor autorNuevo = new Autor(nombre, nacionalidad, fechaDeNacimiento);
        listaAutores.add(autorNuevo);
    }

    public void cambiarEstadoLibro(String identificadorLibro, Estado estado){
        for (int i = 0; i < listaAutores.size(); i++) {
            for (int j = 0; j < listaAutores.get(i).getListaLibros().size(); j++) {
                if(listaAutores.get(i).getListaLibros().get(j).getID().equals(identificadorLibro)){
                    listaAutores.get(i).getListaLibros().get(j).setEstado(estado);
                }
            }
        }
    }
}