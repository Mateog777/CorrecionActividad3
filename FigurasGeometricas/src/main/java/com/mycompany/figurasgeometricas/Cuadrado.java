package com.mycompany.figurasgeometricas;
public class Cuadrado {
    private int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }
    public  double calcularArea() {
    return Math.pow(lado, 2);
 }
    public  double calcularPerimetro() {
    return lado*4;
 }    
    
}
