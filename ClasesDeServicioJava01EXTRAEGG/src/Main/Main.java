
package clasesdeserviciojava01extraegg;

import Entidad.Raices;


public class ClasesDeServicioJava01EXTRAEGG {

   
    public static void main(String[] args) {
        
        Raices ecuacion1 = new Raices(1, -5, 6);
        Raices ecuacion2 = new Raices(1, 2, 1);
        Raices ecuacion3 = new Raices(2, 3, 1);

        System.out.println("Ecuación 1:");
        ecuacion1.calcular();

        System.out.println("\nEcuación 2:");
        ecuacion2.calcular();

        System.out.println("\nEcuación 3:");
        ecuacion3.calcular();
      
    }
    
}
