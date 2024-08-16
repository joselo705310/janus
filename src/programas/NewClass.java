/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;
/**
 *
 * @author INTERPOL
 */
public class NewClass {
    // Método para calcular el ahorro mensual
    public double calcularAhorroMensual(double ingresos, double gastos) {
        return ingresos - gastos;
    }

    // Método para calcular el ahorro anual
    public double calcularAhorroAnual(double ahorroMensual) {
        return ahorroMensual * 12;
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el cargo del empleado: ");
        String cargo = scanner.nextLine();

        System.out.print("Ingrese los ingresos del empleado: ");
        double ingresos = scanner.nextDouble();

        System.out.print("Ingrese los gastos del empleado: ");
        double gastos = scanner.nextDouble();

        // Crear una instancia de la clase NewClass para usar sus métodos
        NewClass calculadora = new NewClass();

        // Calcular ahorro mensual y anual
        double ahorroMensual = calculadora.calcularAhorroMensual(ingresos, gastos);
        double ahorroAnual = calculadora.calcularAhorroAnual(ahorroMensual);

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Cargo del empleado: " + cargo);
        System.out.println("Ahorro mensual: " + ahorroMensual);
        System.out.println("Ahorro anual proyectado: " + ahorroAnual);
        //fin de las instrucciones version 1.0
    }
}
