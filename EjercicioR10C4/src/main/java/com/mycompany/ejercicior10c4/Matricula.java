package com.mycompany.ejercicior10c4;
public class Matricula {
    private String nombres;
    private int numeroInscripcion;
    private double patrimonio;
    private int estrato;

    public Matricula (String nombres,int numeroInscripcion,double patrimonio,
            int estrato){
        this.nombres=nombres;
        this.numeroInscripcion=numeroInscripcion;
        this.patrimonio=patrimonio;
        this.estrato=estrato;
    }
    private double pagoMatricula = 50000;
    public String getNombres(){
        return nombres;
    }
    
    public int getNInscripcion(){
        return numeroInscripcion;
    }
    
    public double getMatricula(){
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += patrimonio * 0.03;
 }  
        return pagoMatricula;
    }    
}
