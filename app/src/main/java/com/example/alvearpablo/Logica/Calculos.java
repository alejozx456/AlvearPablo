package com.example.alvearpablo.Logica;

public class Calculos {

    public double factorial(double numero){
        if(numero==0){
            return 1;
        }else{
            return numero * factorial(numero-1);
        }
    }


}
