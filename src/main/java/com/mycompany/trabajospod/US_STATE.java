package com.mycompany.trabajospod;

import java.util.Scanner;

public class US_STATE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Nomina nomina = new Nomina();
        int opc;

        do {
            System.out.println("========= NOMINA =========");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Mostrar nomina completa");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();

            switch(opc) {
                case 1:
                    sc.nextLine();
                    System.out.println("Cuantos empleados desea registrar");
                    int cant = sc.nextInt();
                    
                    
                    for(int i = 0;i < cant; i++ ){
                        sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    System.out.print("Sueldo base: ");
                    double sueldo = sc.nextDouble();

                    System.out.print("Horas extras trabajadas: ");
                    int horas = sc.nextInt();

                    Empleado emp = new Empleado(nombre, cargo, sueldo, horas);

                    emp.calcularSalario(); 

                    nomina.agregarEmpleado(emp);
                    }

                    break;

                case 2:
                    nomina.mostrarNominaCompleta();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opc != 3);
        System.out.println("Saliendo del sistema.......");
    }
}
