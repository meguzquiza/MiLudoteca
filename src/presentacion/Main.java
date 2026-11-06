package presentacion;

import dominio.Videojuego;
import dominio.Ludoteca;

public class Main {

    public static void main(String[] args) {

        Ludoteca ludoteca = new Ludoteca();

        ludoteca.agregar(new Videojuego("Red Dead Redemption 2", "PS5", 99, 120));
        ludoteca.agregar(new Videojuego("Elden Ring", "PC", 95, 85));
        ludoteca.agregar(new Videojuego("God of War", "PS5", 94, 60));
        ludoteca.agregar(new Videojuego("Super Mario Odyssey", "Switch", 92, 45));
        ludoteca.agregar(new Videojuego("Cyberpunk 2077", "PC", 88, 100));

        System.out.println(ludoteca);

        Videojuego encontrado = ludoteca.buscarPorTitulo("Minecraft"); //Aqui probamos si encuentra el videojuego o no, null es que no
        System.out.println("Videojuego: " + encontrado);
    }
}