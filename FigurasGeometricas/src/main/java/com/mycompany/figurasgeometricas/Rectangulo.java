package com.mycompany.figurasgeometricas;
public class Rectangulo {
    private int base;
    private int altura;
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public  double calcularArea() {
    return base*altura;
 }
    public  double calcularPerimetro() {
    return (base+base+altura+altura);
    
}}
