package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Toby";
        m1.especie = "Perro";
        m1.edad = 4;
        m1.peso = 24.5;

        Mascota m2 = new Mascota();
        m2.nombre = "Mishi";
        m2.especie = "Gato";
        m2.edad = 2;
        m2.peso = 4.3;

        Mascota m3 = new Mascota();
        m3.nombre = "Rocky";
        m3.especie = "Perro";
        m3.edad = 7;
        m3.peso = 18.0;

        Mascota[] pacientes = {m1, m2, m3};

        System.out.println("----- Pacientes de la veterinaria -----");
        for (Mascota m : pacientes) {
            String texto = m.nombre + " : " + m.especie + " : "
                    + m.peso + " kg";
            if (m.peso > 20) {
                texto = texto + "  Revisar peso";
            }
            System.out.println(texto);
        }

        System.out.println();
        System.out.println("Edad de " + m1.nombre + " antes: " + m1.edad);

        Mascota m4 = m1;
        m4.edad = m4.edad + 1;

        System.out.println("Edad de " + m1.nombre + " despues: " + m1.edad);

        /*
         * La edad de m1 cambio aunque solo le sumamos 1 a m4.
         * Esto pasa porque al hacer m4 = m1 no se crea otra mascota nueva,
         * lo que se copia es la referencia (la direccion en memoria).
         * Entonces m1 y m4 apuntan al mismo objeto y si cambio algo
         * con una de las dos variables, la otra tambien lo "ve".
         * Para tener una mascota distinta habria que usar new Mascota().
         */
    }
}
