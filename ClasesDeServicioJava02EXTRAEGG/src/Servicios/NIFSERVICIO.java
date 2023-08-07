
package Servicios;

import Entidad.NIF;
import java.util.Scanner;


public class NIFSERVICIO {
    
     private static final char[] LETRAS_NIF = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
        'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    private Scanner scanner = new Scanner(System.in);

    public char calcularLetraNIF(long numeroDNI) {
        int resto = (int) (numeroDNI % 23);
        return LETRAS_NIF[resto];
    }

    public NIF crearNIF() {
        System.out.print("Ingrese el número de DNI: ");
        long numeroDNI = Long.parseLong(scanner.nextLine());

        char letra = calcularLetraNIF(numeroDNI);

        return new NIF(numeroDNI, letra);
    }

    public void mostrarNIF(NIF nif) {
        System.out.println("NIF: " + nif.obtenerNIFCompleto());
    }

    
}
