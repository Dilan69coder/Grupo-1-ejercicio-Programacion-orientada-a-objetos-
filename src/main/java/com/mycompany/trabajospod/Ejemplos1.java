/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajospod;

import java.util.Scanner;

/**
 *
 * @author dilan
 */
public class Ejemplos1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = "admin";
        String contrasena = "1234";
        System.out.println("Ingrese el usuario:");
        String admin = sc.nextLine();
        System.out.println("Ingrese la contraseña:");
        String passIngresada = sc.nextLine();
        
        while (!(admin.equals(usuario) && passIngresada.equals(contrasena))) {
            System.out.println("Usuario o contraseña incorrectos, intentelo ");

            System.out.println("Ingrese el usuario ");
            admin = sc.nextLine();

            System.out.println("Ingrese la contraseña ");
            passIngresada = sc.nextLine();
        }
        System.out.println("Acceso concedido.");
    }
}

