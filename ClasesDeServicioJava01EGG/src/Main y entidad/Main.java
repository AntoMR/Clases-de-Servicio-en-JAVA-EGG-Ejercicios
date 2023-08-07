
package clasesdeserviciojava01egg;

import Servicios.CuentaBancariaServicio;


public class ClasesDeServicioJava01EGG {

   
    public static void main(String[] args) {
        
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta = servicio.crearCuenta();
        
        servicio.ingresar(cuenta, 1000);
        servicio.retirar(cuenta, 500);
        servicio.extraccionRapida(cuenta);
        
        System.out.println("\nInformación de la cuenta:");
        servicio.consultarDatos(cuenta);
        servicio.consultarSaldo(cuenta);
      
    }
    
}
