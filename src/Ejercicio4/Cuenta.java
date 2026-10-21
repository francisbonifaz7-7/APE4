package ejercicio4;

public class Cuenta {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }
}
