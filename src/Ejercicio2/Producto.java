package ejercicio2;

public class Producto {
    String nombre;
    double precio;
    int stock;

    void vender(int unidades) {
        stock -= unidades;
    }

    double valorEnStock() {
        return precio * stock;
    }
}
