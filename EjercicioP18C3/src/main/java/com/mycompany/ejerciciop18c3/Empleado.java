package com.mycompany.ejerciciop18c3;

public class Empleado {

    private double horas_trabajadas_mes;
    private double valor_hora;
    private double porcentaje_retencion;

    public Empleado(double horas_trabajadas_mes, double valor_hora, double porcentaje_retencion) {
        this.horas_trabajadas_mes = horas_trabajadas_mes;
        this.valor_hora = valor_hora;
        this.porcentaje_retencion = porcentaje_retencion;
    }

    private double salario_bruto() {
        return (horas_trabajadas_mes * valor_hora);
    }

    public String calcularSalarioBruto() {
        double salario_bruto = salario_bruto();
        return "El salario bruto es: " + salario_bruto;
    }

    public String calcularSalarioNeto() {
        double salario_bruto = salario_bruto();
        double retencion = (salario_bruto * porcentaje_retencion);
        double salario_neto = (salario_bruto - retencion);
        return "El salario neto es: " + salario_neto;
    }

}
