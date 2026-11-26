package dominio;
import java.util.ArrayList;

public class Ludoteca {
    
    private ArrayList<Videojuego> videojuegos;
    public Ludoteca() {
        videojuegos = new ArrayList<>();
    }
    
    public void añadir(Videojuego videojuego) {
        videojuegos.add(videojuego);
    }

    @Override
    public String toString() {

        String resultado = "";

        for (Videojuego videojuego : videojuegos) {
        resultado += videojuego.toString() + "\n";
        }

        return resultado;
    }

    public Videojuego buscarPorTitulo(String titulo) {

        for (Videojuego videojuego : videojuegos) {

            if (videojuego.getTitulo().equals(titulo)) {
                return videojuego;
            }
        }

        return null;
    }

    public void listar() {
        for (Videojuego videojuego : videojuegos) {
            videojuego.mostrarFicha();
        }
    }

    public double calcularPuntuacionMedia() {

        if (videojuegos.isEmpty()) {
            return 0.0;
        }

        int suma = 0;

        for (Videojuego videojuego : videojuegos) {
            suma += videojuego.getPuntuacion();
        }

        return (double) suma / videojuegos.size();
    }

    public Videojuego obtenerMejorValorado() {

        if (videojuegos.isEmpty()) {
            return null;
        }

        Videojuego mejor = videojuegos.get(0);

        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getPuntuacion() > mejor.getPuntuacion()) {
                mejor = videojuego;
            }
        }

        return mejor;
    }
}
