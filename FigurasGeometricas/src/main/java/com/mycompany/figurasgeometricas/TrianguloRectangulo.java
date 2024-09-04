package com.mycompany.figurasgeometricas;
public class TrianguloRectangulo {
    private int base;
    private int altura;
public TrianguloRectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
}

public double calcularArea() {
    return (base * altura)/2;
}

public double calcularPerimetro() {
    return (base + altura + calcularHipotenusa());
}

public double calcularHipotenusa() {
    return Math.pow(base*base + altura*altura, 0.5);
}

public String determinarTipoTriangulo() {
if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
return "Es un triangulo equilatero";
}
else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
return "Es un triangulo escaleno";
}
else {
return"Es un triangulo isosceles";
 } 
}
}
    

