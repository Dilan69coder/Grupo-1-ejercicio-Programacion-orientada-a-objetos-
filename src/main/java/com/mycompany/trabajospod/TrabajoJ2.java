/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajospod;

import java.util.Scanner;

/**
 *
 * @author dilan
 */
public class TrabajoJ2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de horas trabajadas ");
        int horas = sc.nextInt();

        System.out.print("Ingrese el precio por hora ");
        double precio = sc.nextDouble();

        double salario = horas * precio;

        if (horas > 48) {
            salario = salario * 2;
        }
        System.out.println("El salario total es: $" + salario);
    }
}

