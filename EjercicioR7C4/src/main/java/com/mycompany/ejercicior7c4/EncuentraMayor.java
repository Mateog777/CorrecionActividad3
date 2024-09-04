package com.mycompany.ejercicior7c4;
public class EncuentraMayor {
    private int A;
    private int B;
    public EncuentraMayor(int A,int B){
        this.A = A;
        this.B = B;    
  }   
    public String Mayor(){
        if (A > B) {
           return "A es mayor que B";
        } else if (A < B) {
           return "A es menor que B";
        } else {
            return"A es igual a B";
    }
    }}   

