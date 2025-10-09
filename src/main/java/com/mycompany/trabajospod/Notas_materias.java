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
public class Notas_materias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int corte = 0;               
        int cantMaterias = 0;        
        String[] materias = null;    
        double[] notas = null;       
        int opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ingrese el corte (1°=30%, 2°=30% y 3°=40%)");
            System.out.println("2. Ingrese las materias del corte ");
            System.out.println("3. Ingrese las notas de cada materia (Quiz, Taller, Parcial)");
            System.out.println("4. Resultado de corte");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("¿Que corte es (1,2,3)? ");
                    corte = sc.nextInt();
                        System.out.println("Haz elegido el corte N° " + corte);
                        break;

                case 2:
                    System.out.print("¿Cuantas materias hay en el corte? ");
                    cantMaterias = sc.nextInt();
                    sc.nextLine();

                    materias = new String[cantMaterias];
                    for (int i = 0; i < cantMaterias; i++) {
                        System.out.print("Ingrese el nombre de la materia " + (i + 1) + ": ");
                        materias[i] = sc.nextLine();
                    }
                    break;

                case 3:
                    if (materias == null) {
                        System.out.println("Primero debes ingresar las materias (opción 2).");
                        break;
                    }
                    
                    double nota = 0;

                    notas = new double[cantMaterias];
                    for (int i = 0; i < cantMaterias; i++) {
                        System.out.println("Teniendo en cuenta Quiz = 20%, Taller 30% y Parcial 50% \n");
                        System.out.print("Ingrese la nota del quiz de \n" + materias[i] + ": ");
                        double quiz = sc.nextDouble();
                        quiz = (quiz*0.2);
                        System.out.print("Ingrese la nota del taller de \n" + materias[i] + ": ");
                        double taller = sc.nextDouble();
                        taller = (taller*0.3);
                        System.out.print("Ingrese la nota del parcial de \n" + materias[i] + ": ");
                        double parcial = sc.nextDouble();
                        parcial = (parcial*0.5);
                        nota = (quiz + taller +parcial);
                        System.out.println("Definitiva de " + materias[i] + " es de: " + nota);
                        notas[i] = nota;
                        
                    }
                    break;

                case 4:
                    if (materias == null || notas == null) {
                        System.out.println("Faltan datos. Ingrese materias y notas primero.");
                        break;
                    }

                    System.out.println("\n--- Resultados del corte " + corte + " ---");
                    double suma = 0;
                    for (int i = 0; i < cantMaterias; i++) {
                        System.out.println(materias[i] + ": " + notas[i]);
                        suma += notas[i];
                    }
                    double promedio = suma / cantMaterias;
                    System.out.println("Promedio del corte: " + promedio);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}




