package com.mycompany.trabajospod;

import java.util.ArrayList;

public class Nomina {

    public ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void mostrarNominaCompleta() {
        System.out.println("\n========== NOMINA COMPLETA ==========");

        double total = 0;

        for (Empleado e : empleados) {
            e.mostrarDatos();
            total += e.salarioNeto;
        }

        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("=====================================\n");
    }
}
