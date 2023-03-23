package activitat3.biblioteca;

public class Sancion {
    private int numPrestamos;

    public Sancion(){
        this.numPrestamos = 0;
    }

    public void anyadirUnaSancion(){
        this.numPrestamos++;
    }
}