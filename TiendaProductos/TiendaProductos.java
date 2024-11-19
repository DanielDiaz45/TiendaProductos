package TiendaProductos;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TiendaProductos {

    public static void main(String[] args) {

        ArrayList<Productos> productos = new ArrayList<>();

        Productos p1 = new Productos("Tallarines don vicente", 2000.0, "Comestible");
        Productos p2 = new Productos("Cerveza andes 1L", 500.0, "Bebida");
        Productos p3 = new Productos("Detergente", 2500.0, "Limpieza");
        Productos p4 = new Productos("Ravioles orali", 5000.0, "Comestible");
        Productos p5 = new Productos("Agua villavicencio 1.5L", 2200.0, "Bebida");

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }

        p1.setPrecio(1900.0);
        System.out.println(p1);

        productos.remove(p1);
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }

    }
}
