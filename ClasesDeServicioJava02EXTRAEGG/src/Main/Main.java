
package clasesdeserviciojava02extraegg;

import Entidad.NIF;
import Servicios.NIFSERVICIO;


public class ClasesDeServicioJava02EXTRAEGG {

   
    public static void main(String[] args) {
      
         NIFSERVICIO nifService = new NIFSERVICIO();

        NIF nif = nifService.crearNIF();
        nifService.mostrarNIF(nif);
    }
    
}
