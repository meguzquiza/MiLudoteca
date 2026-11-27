package dominio;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
    
    public void guardar() {
        try (ObjectOutputStream salida = new ObjectOutputStream(
        new FileOutputStream("ludoteca.dat"))) {
            salida.writeObject(videojuegos);
            System.out.println("Guardado correctamente.");
        }   
        catch (IOException e) {
            System.out.println("Error de guardado: " + e.getMessage());
        }
    }

    public void cargar() {
        try (ObjectInputStream entrada = new ObjectInputStream(
            new FileInputStream("ludoteca.dat"))) {
            videojuegos = (ArrayList<Videojuego>) entrada.readObject();
            System.out.println("Ludoteca cargada correctamente.");

        }
        catch (IOException e) {
            System.out.println("error al cargar el fichero. Creando ludoteca vacía.");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Error al reconocer los datos del fichero.");
        }
    }
}
