package dominio;
import java.util.ArrayList;

public class Ludoteca {
    
    private ArrayList<Videojuego> videojuegos;
    public Ludoteca() {
        videojuegos = new ArrayList<>();
    }
    
    public void agregar(Videojuego videojuego) {
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
}
