
package com.mycompany.ejerciciop22c4;
public class Empleado {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;
    
    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }
    public String getNombre() {
        return nombre;
    }
    public String getSalario(){
        double salarioMensual =calcularSalarioMensual();
        if (salarioMensual > 450000) {
            return "Salario mensual: $" + salarioMensual;
        } 
        else if (salarioMensual == 450000) {
            return "El salario mensual es igual a $450.000";
        }
        else {
            return "El salario mensual es menor de $450.000";
        }
    }
}




