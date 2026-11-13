package dominio;

public class VideojuegoOnline extends Videojuego {

    private int numeroJugadoresOnline;

    public VideojuegoOnline(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroJugadoresOnline) {

        super(titulo, plataforma, puntuacion, horasJugadas);

        this.numeroJugadoresOnline = numeroJugadoresOnline;
    }

    public int getNumeroJugadoresOnline() {
        return numeroJugadoresOnline;
    }

    public int setNumeroJugadoresOnline(int numeroJugadoresOnline) {
        if (numeroJugadoresOnline < 0) {
            return -1;
        }

        this.numeroJugadoresOnline = numeroJugadoresOnline;
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Número jugadores: " + numeroJugadoresOnline;
    }

}