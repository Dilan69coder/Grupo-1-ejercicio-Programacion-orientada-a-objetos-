/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajospod;

/**
 *
 * @author dilan
 */
public class sobrecarga {
    
    int operacion(int n1, int n2){
        return n1 + n2;
    }

    double operacion(double n1, double n2){
        return n1 * n2;
    }

    int operacion(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    
    public static void main(String[] args){
        sobrecarga obj = new sobrecarga();  
        System.out.println("Resultado: " + obj.operacion(2, 3));
    }
}
