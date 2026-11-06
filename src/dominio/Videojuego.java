package dominio;

public class Videojuego {
    
    private String titulo;
    private String plataforma;
    private int puntuacion;
    private int horasJugadas;

    public Videojuego(String titulo, String plataforma, int puntuacion, int horasJugadas) {

        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("No puede estar el título vacio.");
        }

        if (puntuacion < 0 || puntuacion > 100) {
            throw new IllegalArgumentException("Escribe un número entre 0 y 100.");
        }

        if (horasJugadas < 0) {
            throw new IllegalArgumentException("No puedes jugar menos de 0 horas tio.");
        }

        this.titulo = titulo;
        this.plataforma = plataforma;
        this.puntuacion = puntuacion;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getPlataforma() {
        return plataforma;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public int setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank())
            return -1;
        
        this.titulo = titulo;
        return 0;
    }

    public int setPlataforma(String plataforma) {
        this.plataforma = plataforma;
        return 0;
    }

    public int setPuntuacion(int puntuacion) {
        if (puntuacion < 0 || puntuacion > 100)
            return -1;

        this.puntuacion = puntuacion;
        return 0;
    }

    public int setHorasJugadas(int horasJugadas) {
        if (horasJugadas < 0)
            return -1;

        this.horasJugadas = horasJugadas;
        return 0;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Plataforma: " + plataforma + ", Puntuacion: " + puntuacion + ", Horas jugadas: " + horasJugadas;
    }

}
