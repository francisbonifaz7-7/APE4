package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.titular = "Andrea Lopez";
        c1.saldo = 200;

        Cuenta c2 = new Cuenta();
        c2.titular = "Kevin Ortiz";
        c2.saldo = 350;

        double meta = 500;
        double deposito = 50;

        // cuenta 1
        System.out.println("----- Ahorro de " + c1.titular + " -----");
        int meses1 = 0;
        while (c1.saldo < meta) {
            c1.depositar(deposito);
            meses1++;
            System.out.println("Mes " + meses1 + " -> "
                    + c1.titular + " : " + c1.saldo);
        }

        // cuenta 2
        System.out.println();
        System.out.println("----- Ahorro de " + c2.titular + " -----");
        int meses2 = 0;
        while (c2.saldo < meta) {
            c2.depositar(deposito);
            meses2++;
            System.out.println("Mes " + meses2 + " -> "
                    + c2.titular + " : " + c2.saldo);
        }

        System.out.println();
        System.out.println(c1.titular + " necesito " + meses1 + " meses");
        System.out.println(c2.titular + " necesito " + meses2 + " meses");
    }
}
