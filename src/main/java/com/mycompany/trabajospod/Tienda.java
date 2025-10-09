/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajospod;

import java.util.Scanner;

import java.util.ArrayList;

        
/**
 *
 * @author dilan
 */

public class Tienda { 
    String nombre ;
    int precio;
public static class Alimento extends Tienda{
    boolean refrigeracion;
    String vencimiento;
  
    public Alimento(String nombre, int precio, boolean refrigeracion, String vencimiento) {
            this.nombre = nombre;
            this.precio = precio;
            this.refrigeracion = refrigeracion;
            this.vencimiento = vencimiento;
}
    public void mostrar(){
        System.out.println("Producto:  "+ nombre);
        System.out.println("Precio:  "+ precio);
        System.out.println("Refrigeracion:  "+(refrigeracion? "Si":"No"));
        System.out.println("Vencimiento:  "+ vencimiento );
    }
}
public static class Electro extends Tienda{
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
    public void mostrar(){
        System.out.println("Producto:  "+ nombre);
        System.out.println("Precio:  "+ precio);
        System.out.println("Marca:  "+ marca);
        System.out.println("Garantia de: "+meses +" meses" );
        System.out.println("Consumo de electricidad: "+ consumo);
}
}
public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    Tienda tienda = new Tienda();
    ArrayList<Tienda> productos = new ArrayList<>();
    int opcion;
    String clas;
    int contador = 0;
    do{
        System.out.println("\n-- Cajero de Tienda --");
        System.out.println("1. Ingrese los productos a pagar ");
        System.out.println("2. Mostrar Factura");
        System.out.println("3. Salir ");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Cuantos productos deseas comprar:  ");
                int cantidad = sc.nextInt();
                sc.nextLine();
                String tipo;
                int total = 0;
                for (int i= 0; i<cantidad; i++){
                    System.out.println("Producto #"+(i+1));
                    System.out.print("Ingresa el tipo de producto (A o E)");
                    tipo = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Nombre del producto ");
                    String nombre = sc.nextLine();
                    System.out.println("Precio ");
                    int precio = sc.nextInt();
                    sc.nextLine();
                    
                    if (tipo.equalsIgnoreCase("A")){
                         System.out.print("¿Requiere refrigeración? (S/N): ");
                            boolean refrigeracion = sc.nextLine().equalsIgnoreCase("S");
                            System.out.print("Fecha de vencimiento (dd/mm/aa): ");
                            String vencimiento = sc.nextLine();
                           
                    productos.add(new Alimento(nombre,precio,refrigeracion,vencimiento));
                    }
                    else if (tipo.equalsIgnoreCase("E")){
                        System.out.println("Marca de "+ nombre +" ");
                            String marca = sc.nextLine();
                        System.out.println("Garantia (Meses) ");
                            int meses = sc.nextInt();
                        System.out.println("Consumo electrico (A,B,C,D,E,F)");
                            String consumo = sc.nextLine();// A,B                            
                    productos.add(new Electro(nombre,precio,marca,meses,consumo));

                    }
                    else {
                        System.out.print("Caracter invalido vuelve a ingresarlo ");
                            i--;
                               
                }
                }
                break;
        
            
            case 2:
                if (productos.isEmpty()) {
                        System.out.println("\n No hay productos");
                    } else {
                    int total1 = 0;
                        System.out.println("\n--Factura--");
                        for (Tienda p : productos) {
                            System.out.println("----------------------");
                            if (p instanceof Tienda.Alimento) {
                                ((Tienda.Alimento) p).mostrar();
                            } else if (p instanceof Tienda.Electro) {
                                ((Tienda.Electro) p).mostrar();
                            }
                            total1 += p.precio;
                        }
                        System.out.println("----------------------");
                        System.out.println("Total a pagar:  $" + total1);
                    }
                    break;
                
                case 3:
                    System.out.println("Saliendo del sistem");
                break;

        }
               
        

} while (opcion != 3);
    
}
}


    



