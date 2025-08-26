/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dilan
 */
public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Calcule precio final de un producto aplicando un descuento ramdon el usuario ingresa el precio original y el descuento
    System.out.print("Ingrese el precio original del producto ");
    int producto = sc.nextInt();
    System.out.print("Ingrese el descuento del producto");
    int descuento = sc.nextInt();
    double totaldescuento = (descuento * producto)/100;
    double total = (producto - totaldescuento);
        System.out.println("el total de tu compra aplicando el "+ descuento + "% de descuento es de "+ total);
    
    
    }
}
