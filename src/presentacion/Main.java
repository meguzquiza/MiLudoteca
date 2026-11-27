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
        ludoteca.cargar();
        
        ludoteca.añadir(new Videojuego("Red Dead Redemption 2", "PS5", 99, 120));
        ludoteca.añadir(new Videojuego("Elden Ring", "PC", 95, 85));
        ludoteca.añadir(new Videojuego("God of War", "PS5", 94, 60));
        ludoteca.añadir(new Videojuego("Super Mario Odyssey", "Switch", 92, 45));
        ludoteca.añadir(new Videojuego("Cyberpunk 2077", "PC", 88, 100));
    
        ludoteca.añadir(new VideojuegoRol("Skyrim", "PC", 95, 120, 50));
        ludoteca.añadir(new VideojuegoDeportivo("FIFA", "PS5", 85, 200, "Futbol"));
        ludoteca.añadir(new VideojuegoEstrategia("Age of Empires", "PC", 90, 80, 4));
        ludoteca.añadir(new VideojuegoOnline("Fortnite", "PC", 80, 300, 100));

        ludoteca.listar();
        System.out.printf("Puntuación media: %.2f%n", ludoteca.calcularPuntuacionMedia());       //line ade texto de la media
        Videojuego mejorValorado = ludoteca.obtenerMejorValorado();
        System.out.println("Mejor valorado -> " + mejorValorado);      //linea de texto del mejor valorado

        Videojuego encontrado = ludoteca.buscarPorTitulo("Skyrim"); //Aqui probamos si encuentra el videojuego o no, null es que no
        System.out.println("Videojuego: " + encontrado);
        ludoteca.guardar();
    }
}