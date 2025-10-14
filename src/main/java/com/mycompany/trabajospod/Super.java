package com.mycompany.trabajosjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Super { 
    String nombre;
    int precio;

    public static class Alimento extends Super {
        boolean refrigeracion;
        String vencimiento;

        public Alimento(String nombre, int precio, boolean refrigeracion, String vencimiento) {
            this.nombre = nombre;
            this.precio = precio;
            this.refrigeracion = refrigeracion;
            this.vencimiento = vencimiento;
        }

        public void mostrar() {
            System.out.println("Producto:  " + nombre);
            System.out.println("Precio:  " + precio);
            System.out.println("Refrigeracion:  " + (refrigeracion ? "Si" : "No"));
            System.out.println("Vencimiento:  " + vencimiento);
        }
    }
    public static class Electro extends Super {
        String marca;
        int meses;
        String consumo;
        public Electro(String nombre, int precio, String marca, int meses, String consumo) {
            this.nombre = nombre;
            this.precio = precio;
            this.marca = marca;
            this.meses = meses;
            this.consumo = consumo;
        }
        public void mostrar() {
            System.out.println("Producto:  " + nombre);
            System.out.println("Precio:  " + precio);
            System.out.println("Marca:  " + marca);
            System.out.println("Garantia de: " + meses + " meses");
            System.out.println("Consumo de electricidad: " + consumo);
        }
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Super> productos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n-- Cajero de Tienda --");
            System.out.println("1. Ingrese los productos a pagar ");
            System.out.println("2. Mostrar Factura");
            System.out.println("3. Salir ");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Cuantos productos deseas comprar:  ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("\nProducto #" + (i + 1));
                        System.out.print("Ingresa el tipo de producto (A o E): ");
                        String tipo = sc.nextLine();

                        System.out.print("Nombre del producto: ");
                        String nombre = sc.nextLine();

                        System.out.print("Precio: ");
                        int precio = sc.nextInt();
                        sc.nextLine();

                        if (tipo.equalsIgnoreCase("A")) {
                            System.out.print("¿Requiere refrigeración? (S/N): ");
                            boolean refrigeracion = sc.nextLine().equalsIgnoreCase("S");

                            System.out.print("Fecha de vencimiento (dd/mm/aa): ");
                            String vencimiento = sc.nextLine();

                            productos.add(new Alimento(nombre, precio, refrigeracion, vencimiento));

                        } else if (tipo.equalsIgnoreCase("E")) {
                            System.out.print("Marca de " + nombre + ": ");
                            String marca = sc.nextLine();

                            System.out.print("Garantia (Meses): ");
                            int meses = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Consumo electrico (A,B,C,D,E,F): ");
                            String consumo = sc.nextLine();

                            productos.add(new Electro(nombre, precio, marca, meses, consumo));

                        } else {
                            System.out.println("Caracter invalido, vuelve a ingresarlo.");
                            i--; // repetir el mismo producto
                        }
                    }
                    break;

                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("\nNo hay productos");
                    } else {
                        int total1 = 0;
                        System.out.println("\n-- Factura --");
                        for (Super p : productos) {
                            System.out.println("----------------------");
                            if (p instanceof Super.Alimento) {
                                ((Super.Alimento) p).mostrar();
                            } else if (p instanceof Super.Electro) {
                                ((Super.Electro) p).mostrar();
                            }
                            total1 += p.precio;
                        }
                        System.out.println("----------------------");
                        System.out.println("Total a pagar:  $" + total1);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
                    break;
            }
        } while (opcion != 3);
        sc.close();
    }
}
