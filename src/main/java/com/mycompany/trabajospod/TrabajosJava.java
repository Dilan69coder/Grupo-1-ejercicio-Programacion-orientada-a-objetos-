/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajospod;

import java.util.Scanner;

/**
 *
 * @author dilan
 */
public class TrabajosJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        if (suma > 100) {
            System.out.println("La suma es mayor que 100  " + suma);
        } 
        else{
            System.out.println("La suma es menor que 100  " + suma);
        }
    }
    }

