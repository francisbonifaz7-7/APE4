package ejercicio1;

public class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    // saca el promedio de las tres notas y lo redondea a 2 decimales
    void sacarPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
        promedio = Math.round(promedio * 100) / 100.0;
    }

    String situacion() {
        if (promedio >= 7) {
            return "Aprobado";
        } else if (promedio >= 5) {
            return "Supletorio";
        }
        return "Reprobado";
    }
}
