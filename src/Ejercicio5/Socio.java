package ejercicio5;

public class Socio {
    String nombre;
    int librosPrestados = 0;

    // marca el libro como prestado y le suma uno al socio
    void prestar(Libro libro) {
        if (libro.disponible) {
            libro.disponible = false;
            librosPrestados++;
        } else {
            System.out.println(libro.titulo + " ya esta prestado");
        }
    }
}
