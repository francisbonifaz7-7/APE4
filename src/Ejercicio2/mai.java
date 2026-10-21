package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        prod1.nombre = "Cuaderno";
        prod1.precio = 1.25;
        prod1.stock = 30;

        Producto prod2 = new Producto();
        prod2.nombre = "Calculadora";
        prod2.precio = 18.50;
        prod2.stock = 6;

        Producto prod3 = new Producto();
        prod3.nombre = "Mochila";
        prod3.precio = 25.00;
        prod3.stock = 7;

        Producto prod4 = new Producto();
        prod4.nombre = "Esferos";
        prod4.precio = 0.50;
        prod4.stock = 50;

        Producto[] tienda = {prod1, prod2, prod3, prod4};

        System.out.println("----- Productos de la tienda -----");
        for (Producto p : tienda) {
            System.out.println(p.nombre + " : " + p.precio);
        }

        // se venden 3 unidades de la calculadora y 3 de la mochila
        prod2.vender(3);
        prod3.vender(3);
        System.out.println();
        System.out.println("Se vendieron 3 unidades de " + prod2.nombre
                + " y 3 de " + prod3.nombre);

        System.out.println();
        System.out.println("----- Stock despues de la venta -----");
        double totalInventario = 0;
        for (Producto p : tienda) {
            String linea = p.nombre + " : " + p.precio
                    + " (quedan " + p.stock + ")";
            if (p.stock < 5) {
                linea = linea + " Reponer";
            }
            System.out.println(linea);
            totalInventario = totalInventario + p.valorEnStock();
        }
        System.out.println("Valor del inventario: $" + totalInventario);
    }
}
