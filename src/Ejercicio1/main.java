package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "Camila";
        est1.nota1 = 8.5;
        est1.nota2 = 9;
        est1.nota3 = 7.5;

        Estudiante est2 = new Estudiante();
        est2.nombre = "Mateo";
        est2.nota1 = 6;
        est2.nota2 = 5.5;
        est2.nota3 = 7;

        Estudiante est3 = new Estudiante();
        est3.nombre = "Valeria";
        est3.nota1 = 10;
        est3.nota2 = 9.5;
        est3.nota3 = 9;

        Estudiante est4 = new Estudiante();
        est4.nombre = "Jose";
        est4.nota1 = 3.5;
        est4.nota2 = 5;
        est4.nota3 = 4;

        Estudiante est5 = new Estudiante();
        est5.nombre = "Daniela";
        est5.nota1 = 7;
        est5.nota2 = 6.5;
        est5.nota3 = 8;

        Estudiante[] curso = {est1, est2, est3, est4, est5};
        int contAprobados = 0;

        System.out.println("----- Notas del curso -----");
        for (int i = 0; i < curso.length; i++) {
            curso[i].sacarPromedio();
            String estado = curso[i].situacion();
            System.out.println(curso[i].nombre + " : "
                    + curso[i].promedio + " " + estado);
            if (estado.equals("Aprobado")) {
                contAprobados++;
            }
        }
        System.out.println("Total de aprobados: " + contAprobados);
    }
}
