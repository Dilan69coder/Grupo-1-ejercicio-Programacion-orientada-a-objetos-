/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajosjava;

import java.util.Scanner;

/**
 *
 * @author dilan
 */
public class Notas_materias {//Programa para calcular notas en los cortes de cada semeestre
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] corte = new int[2];
        int cant = 0;
        int opcion;
        do {
            System.out.println("\n---Menu---")
            System.out.println("1.Ingrese el corte ");
            System.out.println("2.Ingrese las materias del corte ");
            System.out.println("3.Ingrese las notas de cada materia ")
            System.out.println("4.Resultado de corte/s ")
            opcion = sc.nextInt();
            sc.nextLine();
           
            switch(opcion){
                case 1:
                    System.out.println("¿Que corte es (1,2,3)?");
                    corte[0] = sc.nextInt();
                    System.out.print("Haz elegido el corte "+ corte );
              
                case 2:
                    System.out.println("¿Cuantas materias hay en el corte?")
                    cant = sc.nextInt();
                    String[] materias = new string[];
                        while(cant >= 0){
                        System.out.println("Cuales son las materias del corte ")
                        materias[] = sc.nextString();
                            for (int i =0; i<= cant; i++){
                            cant --;
                        }
                        }
                        System.out.print("Haz ingresado la materia "+ materias[i]+" en el corte N°"+corte[] )
                case 3://notas de materias 
                    String[] materias2 = new String[];
                    int cantm;
                    cantm = materias[].lenght;
                    System.out.pintln("Ingrese las notas de las materias:  ");
                    materia2[] = sc.nextString();
                    while (cant >=0)
                        for(j=0; j <= materia2.lenght; j= j+1){
                            for (int i =0; i<=materias[].lenght; i++){
                            if (materias2[j] == materias[i])
                                }
                        }
                    System.out.print("Las notas de la materia "+materias[i]+" es de "+[])
                        }
                case 4:// notas en el/los cortes 
            }
        }
        }

       
        



