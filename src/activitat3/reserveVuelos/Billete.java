package activitat3.reserveVuelos;

import java.util.ArrayList;

public class Billete {
    final static float PRECIO_EXTRA_POR_MALETA = 10;
    private String codigo;
    private int numeroPlazas;
    private int filaDeAsiento;
    private String letraDelAsietnto;
    private Vuelo vuelo;
    private float precio;
    private ArrayList<Maleta> listaMaletas;

    public Billete(String codigo, int numeroPlazas, int filaDeAsiento, String letraDelAsietnto, Vuelo vuelo, float precio) {
        this.codigo = codigo;
        this.numeroPlazas = numeroPlazas;
        this.filaDeAsiento = filaDeAsiento;
        this.letraDelAsietnto = letraDelAsietnto;
        this.vuelo = vuelo;
        this.precio = precio;
        this.listaMaletas = new ArrayList<>();
    }

    public void anyadirMaleta(Maleta maleta){
        if(listaMaletas.size() >= 3){
            System.out.println("Maximo puedes tener 3 maletas");
            return;
        }

        listaMaletas.add(maleta);
        if(maleta.getPesoMaleta() < 23){
            precio += PRECIO_EXTRA_POR_MALETA;
        }
    }
}