package activitat3.reserveVuelos;

public class Vuelo {
    private String codigo;
    private Avion avion;
    private Aearopuearto aeropueartoOrigen;
    private Aearopuearto aeropueartoDestino;
    private Terminal terminalOrigen;
    private Terminal terminalDestino;

    public Vuelo(String codigo, Avion avion, Aearopuearto aeropueartoOrigen, Aearopuearto aeropueartoDestino,
                 Terminal terminalOrigen, Terminal terminalDestino) {
        this.codigo = codigo;
        this.avion = avion;
        this.aeropueartoOrigen = aeropueartoOrigen;
        this.aeropueartoDestino = aeropueartoDestino;
        this.terminalOrigen = terminalOrigen;
        this.terminalDestino = terminalDestino;
    }
}