package dominio;

public class VideojuegoDeportivo extends Videojuego {

    private String deporte;

    public VideojuegoDeportivo(String titulo, String plataforma, int puntuacion, int horasJugadas, String deporte) {

        super(titulo, plataforma, puntuacion, horasJugadas);      // Usamos el constructor del padre para inicializar los datos que heredamos.

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
        return super.toString() + ", Deporte: " + deporte;   //con super.ToString usamos el ToString ya existente en la clase padre y añadimos su nuevo atributo
    }
}