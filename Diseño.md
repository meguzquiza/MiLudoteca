
```mermaid
classDiagram
    class Ludoteca {
        -ArrayList~Videojuego~ videojuegos
        +Ludoteca()
        +agregar(Videojuego videojuego) void
        +toString() String
        +buscarPorTitulo(String titulo) Videojuego
    }

    class Videojuego {
        -String titulo
        -String plataforma
        -int puntuacion
        -int horasJugadas
    }

    Ludoteca o-- "0..*" Videojuego
```

Ludoteca tiene una lista donde guarda diferentes videojuegos. Estos videojuegos se pueden crear por separado y seguir existiendo aunque se eliminen de la ludoteca.
No utilizamos herencia porque una ludoteca no es un videojuego, sino que sirve para guardar y organizar varios videojuegos.