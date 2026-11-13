package dominio;

public class VideojuegoRol extends Videojuego {
    
    private int numeroMisiones;

    public VideojuegoRol(String titulo, String plataforma, int puntuacion, int horasJugadas, int numeroMisiones) {

        super(titulo, plataforma, puntuacion, horasJugadas);     // Usamos el constructor del padre para inicializar los datos que heredamos.

        this.numeroMisiones = numeroMisiones;
    }

    public int getNumeroMisiones() {
        return numeroMisiones;
    }

    public int setNumeroMisiones(int numeroMisiones) {
        if (numeroMisiones < 0) {
            return -1;
        }

        this.numeroMisiones = numeroMisiones;
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Número misiones: " + numeroMisiones;   //con super.ToString usamos el ToString ya existente en la clase padre y añadimos su nuevo atributo
    }
}
