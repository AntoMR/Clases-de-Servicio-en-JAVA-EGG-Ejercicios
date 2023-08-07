
package Servicios;

import clasesdeserviciojava03egg.Persona;
import java.util.Scanner;


public class PersonaServicio {
    
    private Scanner scanner = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese la edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese el sexo (H/M/O): ");
        char sexo = scanner.nextLine().charAt(0);
        
        System.out.print("Ingrese el peso (kg): ");
        double peso = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese la altura (mt): ");
        double altura = Double.parseDouble(scanner.nextLine());
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        
        if (imc < 20) {
            return -1; // Por debajo de peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }
    
}
