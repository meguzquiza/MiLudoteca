package dominio;

public class VideojuegoDeportivo extends Videojuego {

    private String deporte;

    public VideojuegoDeportivo(String titulo, String plataforma, int puntuacion, int horasJugadas, String deporte) {

        super(titulo, plataforma, puntuacion, horasJugadas);

        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public int setDeporte(String deporte) {
        if (deporte == null || deporte.isBlank()) {
            return -1;
        }

        this.deporte = deporte;
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Deporte: " + deporte;
    }
}