package activitat3.reserveVuelos;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String email;
    private ArrayList<Billete> listaBilletes;

    public Cliente(String nombre, String apellidos, String DNI, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.email = email;
        this.listaBilletes = new ArrayList<>();
    }

    public void anyadirBillete(Billete billete){
        listaBilletes.add(billete);
    }
}