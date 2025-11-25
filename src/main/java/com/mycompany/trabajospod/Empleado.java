package com.mycompany.trabajospod;

public class Empleado {

    public String nombre;
    public String cargo;
    public double sueldo;
    public int cant_horas;
    public double horas_extras = 35000;
    public double minimo = 1423500;
    public double retencion;
    public double seguridad;
    public double salarioBruto;
    public double salarioNeto;

    public Empleado(String nombre, String cargo, double sueldo, int cant_horas) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.cant_horas = cant_horas;
    }

    public void calcularSalario() {

        System.out.println("\n========== Ingresando Empleado ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);

//Horas extras
        double pagoExtras = 0;
        if (cant_horas > 0) {
            pagoExtras = (cant_horas * horas_extras);
            System.out.println("Horas extras: " + cant_horas + " total:  $" + pagoExtras);
        } else {
            System.out.println("Sin horas extras.");
        }

//Seguridad social
        seguridad = sueldo * 0.04;
        System.out.println("Seguridad Social (4%): $" + seguridad);

//Retencion
        System.out.println("Salario minimo actual:  "+(minimo));
        if (sueldo >= minimo * 3 && sueldo <= minimo * 5) {
            retencion = sueldo * 0.10;
            System.out.println("Retencion del 10% por sueldo mayor a 3 SMMLV y menor a 5 SMMLV total retencion: $" + retencion);
        } else if (sueldo > minimo * 5) {
            retencion = sueldo * 0.16;
            System.out.println("Retencion 16% por sueldo mayor a los 5 SMMLV total retencion: $" + retencion);
        } else {
            retencion = 0;
            System.out.println("Sin retencion por sueldo menor a 3 SMMLV)");
        }

//Sueldo bruto
        salarioBruto = sueldo + pagoExtras;
        System.out.println("Sueldo bruto: $" + salarioBruto);
        
//Total descuentos

        double descuentoTotal = seguridad + retencion;
        System.out.println("Descuento total: $" + descuentoTotal);

// Sueldo neto
        salarioNeto = salarioBruto - descuentoTotal;
        System.out.println("SALARIO NETO: $" + salarioNeto);

        System.out.println("==========================================\n");
    }

    public void mostrarDatos() {
        System.out.println("-------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo base: $" + sueldo);
        System.out.println("Horas extras trabajadas: " + cant_horas);
        System.out.println("Salario neto final: $" + salarioNeto);
        System.out.println("-------------------------------------");
    }
}
