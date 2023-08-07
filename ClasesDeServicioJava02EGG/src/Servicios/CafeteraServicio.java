
package Servicios;

import clasesdeserviciojava02egg.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    
    private Scanner scanner = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada.");
    }

    public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Se ha servido la taza.");
        } else {
            int cantidadServida = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("No hay suficiente café para llenar la taza. Se sirvieron " + cantidadServida + " unidades.");
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe(Cafetera cafetera, int cantidad) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
        System.out.println("Se ha agregado " + cantidad + " unidades de café a la cafetera.");
    }
    
}
