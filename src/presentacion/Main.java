package presentacion;

import dominio.Videojuego;
import dominio.VideojuegoDeportivo;
import dominio.VideojuegoEstrategia;
import dominio.VideojuegoOnline;
import dominio.VideojuegoRol;
import dominio.Ludoteca;

public class Main {

    public static void main(String[] args) {

        Ludoteca ludoteca = new Ludoteca();

        ludoteca.agregar(new Videojuego("Red Dead Redemption 2", "PS5", 99, 120));
        ludoteca.agregar(new Videojuego("Elden Ring", "PC", 95, 85));
        ludoteca.agregar(new Videojuego("God of War", "PS5", 94, 60));
        ludoteca.agregar(new Videojuego("Super Mario Odyssey", "Switch", 92, 45));
        ludoteca.agregar(new Videojuego("Cyberpunk 2077", "PC", 88, 100));

        ludoteca.agregar(new VideojuegoRol("Skyrim", "PC", 95, 120, 50));
        ludoteca.agregar(new VideojuegoDeportivo("FIFA", "PS5", 85, 200, "Futbol"));
        ludoteca.agregar(new VideojuegoEstrategia("Age of Empires", "PC", 90, 80, 4));
        ludoteca.agregar(new VideojuegoOnline("Fortnite", "PC", 80, 300, 100));

        System.out.println(ludoteca);

        Videojuego encontrado = ludoteca.buscarPorTitulo("Minecraft"); //Aqui probamos si encuentra el videojuego o no, null es que no
        System.out.println("Videojuego: " + encontrado);
    }
}