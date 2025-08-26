/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dilan
 */
public class Ejercicio2 {
        public static void main(String[] args) {
            //Desarrolle un programa que genere el sueldo de un trabajor para esto el programa solisitara las horas trabajas y el valor de la hora de trabajo si el empleado trabajo mas de 40 horas se pagara el doble }
    Scanner sc = new Scanner (System.in);
    System.out.print("Ingrese el valor individual de cada hora ");
    int hora = sc.nextInt();
    System.out.print("Ingrese la cantida de horas trabajadas ");
    int cantida = sc.nextInt();
        if (cantida >= 40){
            System.out.println("Como el empleado trabajo mas de 40 horas se le duplicara el sueldo ");
            int salario = (hora*cantida)*2;
            System.out.println("El sueldo total del trabajador sin pagar la salud social es de "+ salario);
            int porcentajesalario = (salario*8)/100;
            int totalsalario = (salario-porcentajesalario);
            System.out.println("El valor neto del salario pagando el 8% en salud es "+ totalsalario);
        }
            else {
             System.out.println("Su sueldo total sin pagar la salud es  " );
            int salario = (hora*cantida) ;
            System.out.println(salario);
            int porcentajesalario = (salario*8)/100;
            int totalsalario = (salario-porcentajesalario);
            System.out.println("El valor neto del salario pagando el 8% en salud es "+ totalsalario);
            
            
            
                    }
            
            
                    
        }

    
}
