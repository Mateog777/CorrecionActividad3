
package com.mycompany.ejerciciop23c4;

public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calcularDiscriminante() {
        return b * b - 4 * a * c;
    }

    public String calcularSoluciones() {
        double discriminante = calcularDiscriminante();


        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Las soluciones son: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "La solución es única: x = " + x;
        } else {
            return "La ecuación no tiene soluciones reales.";
        }
    }
}

