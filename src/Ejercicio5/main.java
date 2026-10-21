package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.titulo = "La Odisea";
        l1.autor = "Homero";

        Libro l2 = new Libro();
        l2.titulo = "A la Costa";
        l2.autor = "Luis A. Martinez";

        Libro l3 = new Libro();
        l3.titulo = "El Alquimista";
        l3.autor = "Paulo Coelho";

        Libro l4 = new Libro();
        l4.titulo = "Cumanda";
        l4.autor = "Juan Leon Mera";

        Socio s1 = new Socio();
        s1.nombre = "Ricardo Sanchez";

        Socio s2 = new Socio();
        s2.nombre = "Paola Villacis";

        // prestamos
        s1.prestar(l1);
        s1.prestar(l3);
        s2.prestar(l4);

        Libro[] libros = {l1, l2, l3, l4};
        Socio[] socios = {s1, s2};

        System.out.println("----- Estado de los libros -----");
        int librosLibres = 0;
        for (Libro l : libros) {
            if (l.disponible) {
                System.out.println(l.titulo + " : Disponible");
                librosLibres++;
            } else {
                System.out.println(l.titulo + " : Prestado");
            }
        }

        System.out.println();
        System.out.println("----- Socios -----");
        for (Socio s : socios) {
            System.out.println(s.nombre + " : " + s.librosPrestados);
        }

        System.out.println();
        System.out.println("Libros disponibles: " + librosLibres);
    }
}
