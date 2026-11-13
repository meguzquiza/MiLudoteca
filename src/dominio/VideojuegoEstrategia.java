package dominio;

public class VideojuegoEstrategia extends Videojuego {

    private int numeroFacciones;

    public VideojuegoEstrategia(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroFacciones) {

        super(titulo, plataforma, puntuacion, horasJugadas);

        this.numeroFacciones = numeroFacciones;
    }

    public int getNumeroFacciones() {
        return numeroFacciones;
    }

    public int setNumeroFacciones(int numeroFacciones) {
        if (numeroFacciones < 0) {
            return -1;
        }

        this.numeroFacciones = numeroFacciones;
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Facciones: " + numeroFacciones;
    }

}