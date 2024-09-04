
package com.mycompany.ejerciciop19c3;
public class Triangulo {
    double lado;
    public Triangulo(double lado){
        this.lado = lado;
    }
    public double calculoAltura() {
        return (Math.pow((Math.pow(lado,2)-(Math.pow((lado/2),2))), 0.5));
    }
    public double calcularPerimetro() {
        double perimetro = lado*3;
        return perimetro;
    }    
    public double calcularAltura() {
        double altura = calculoAltura();
        return altura;
    }    
    public double calcularArea() {
        double altura = calculoAltura();
        double area = ((lado*altura)/2);
        return area;
    }    
           
}
