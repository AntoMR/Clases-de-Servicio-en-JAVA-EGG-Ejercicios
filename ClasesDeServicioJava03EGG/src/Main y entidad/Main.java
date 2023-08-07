
package clasesdeserviciojava03egg;

import Servicios.PersonaServicio;


public class ClasesDeServicioJava03EGG {

    
    public static void main(String[] args) {
        
         PersonaServicio personaServicio = new PersonaServicio();

        Persona persona1 = new Persona("Juan", 25, 'H', 70.5, 1.75);
        Persona persona2 = new Persona("María", 19, 'M', 55.0, 1.60);
        Persona persona3 = personaServicio.crearPersona();
        Persona persona4 = personaServicio.crearPersona();

        // Verificar si las personas son mayores de edad
        System.out.println("¿Persona 1 es mayor de edad? " + personaServicio.esMayorDeEdad(persona1));
        System.out.println("¿Persona 2 es mayor de edad? " + personaServicio.esMayorDeEdad(persona2));
        System.out.println("¿Persona 3 es mayor de edad? " + personaServicio.esMayorDeEdad(persona3));
        System.out.println("¿Persona 4 es mayor de edad? " + personaServicio.esMayorDeEdad(persona4));

        // Calcular IMC y categoría para cada persona
        int imcPersona1 = personaServicio.calcularIMC(persona1);
        int imcPersona2 = personaServicio.calcularIMC(persona2);
        int imcPersona3 = personaServicio.calcularIMC(persona3);
        int imcPersona4 = personaServicio.calcularIMC(persona4);

        System.out.println("Persona 1 - IMC: " + imcPersona1);
        System.out.println("Persona 2 - IMC: " + imcPersona2);
        System.out.println("Persona 3 - IMC: " + imcPersona3);
        System.out.println("Persona 4 - IMC: " + imcPersona4);

        // Calcular porcentaje de IMC y mayor de edad
        int[] imcArray = {imcPersona1, imcPersona2, imcPersona3, imcPersona4};
        int[] mayorEdadArray = {personaServicio.esMayorDeEdad(persona1) ? 1 : 0,
                                personaServicio.esMayorDeEdad(persona2) ? 1 : 0,
                                personaServicio.esMayorDeEdad(persona3) ? 1 : 0,
                                personaServicio.esMayorDeEdad(persona4) ? 1 : 0};

        double porcentajePorDebajoPeso = calcularPorcentaje(imcArray, -1);
        double porcentajePesoIdeal = calcularPorcentaje(imcArray, 0);
        double porcentajeSobrepeso = calcularPorcentaje(imcArray, 1);
        double porcentajeMayorEdad = calcularPorcentaje(mayorEdadArray, 1);
        double porcentajeMenorEdad = calcularPorcentaje(mayorEdadArray, 0);

        System.out.println("Porcentaje por debajo de peso: " + porcentajePorDebajoPeso + "%");
        System.out.println("Porcentaje peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje sobrepeso: " + porcentajeSobrepeso + "%");
        System.out.println("Porcentaje mayor de edad: " + porcentajeMayorEdad + "%");
        System.out.println("Porcentaje menor de edad: " + porcentajeMenorEdad + "%");
    }

    public static double calcularPorcentaje(int[] array, int valor) {
        int contador = 0;
        for (int num : array) {
            if (num == valor) {
                contador++;
            }
        }
        return (double) contador / array.length * 100;
    }
        
    }
    

