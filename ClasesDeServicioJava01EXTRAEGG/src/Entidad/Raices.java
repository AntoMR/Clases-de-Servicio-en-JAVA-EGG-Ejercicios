
package Entidad;


public class Raices {
    
   private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else {
            System.out.println("No tiene raíces reales.");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double raiz = -b / (2 * a);
            System.out.println("Única raíz: " + raiz);
        } else {
            System.out.println("No tiene una única raíz real.");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}