package presentacion;

import dominio.Videojuego;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Videojuego> videojuegos = new ArrayList<>();

        videojuegos.add(new Videojuego("Red Dead Redemption 2", "PS5", 99, 120));
        videojuegos.add(new Videojuego("Elden Ring", "PC", 95, 85));
        videojuegos.add(new Videojuego("God of War", "PS5", 94, 60));
        videojuegos.add(new Videojuego("Super Mario Odyssey", "Switch", 92, 45));
        videojuegos.add(new Videojuego("Cyberpunk 2077", "PC", 88, 100));

        System.out.println("Numero de videojuegos: " + videojuegos.size());

        for (Videojuego juego : videojuegos) {
            System.out.println(juego);
        }
    }
}