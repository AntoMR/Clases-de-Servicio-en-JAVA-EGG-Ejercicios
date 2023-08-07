
package clasesdeserviciojava02egg;

import Servicios.CafeteraServicio;


public class ClasesDeServicioJava02EGG {

   
    public static void main(String[] args) {
        
        CafeteraServicio servicio = new CafeteraServicio();
        Cafetera cafetera = new Cafetera(1000, 500);

        servicio.llenarCafetera(cafetera);
        servicio.servirTaza(cafetera, 200);
        servicio.vaciarCafetera(cafetera);
        servicio.agregarCafe(cafetera, 300);

        System.out.println("\nEstado de la cafetera:");
        System.out.println("Capacidad máxima: " + cafetera.getCapacidadMaxima());
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
    }
       
        
    }
    

