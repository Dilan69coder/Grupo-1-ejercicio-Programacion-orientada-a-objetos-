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
public class EJemploIf {
    public class Ejemplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] estudiantes = {"Camilo", "Ana", "Sara", "Jhon", "Pablo"};
        int[] notas = new int[estudiantes.length];
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Ingrese la nota de " + estudiantes[i]);
            notas[i] = sc.nextInt();
            if (notas[i] >= 95) {
                System.out.println(estudiantes[i] + "  Muy buena nota, sigue asi  " + notas[i]);
            } 
            else if (notas[i] >= 80) {
                System.out.println(estudiantes[i] + "  Felicidades nota sobresaliente " + notas[i]);
            } 
            else if (notas[i] >= 60) {
                System.out.println(estudiantes[i] + "  Aprovastes con nota de " + notas[i]);
            }
            else {
                System.out.println(estudiantes[i] + "  Reprobastes con nota de " + notas[i]);
            }
        }


    }
}
    
}
