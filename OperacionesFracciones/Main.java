package OperacionesFracciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Operaciones con Fracciones ===");

        System.out.print("Ingresa el numerador de la primera fracción: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el denominador de la primera fracción: ");
        int den1 = scanner.nextInt();
        Fraccion fraccion1 = new Fraccion(num1, den1);

        System.out.print("Ingresa el numerador de la segunda fracción: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresa el denominador de la segunda fracción: ");
        int den2 = scanner.nextInt();
        Fraccion fraccion2 = new Fraccion(num2, den2);

        System.out.println("\n=== Resultados ===");
        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);

        System.out.println("Suma: " + fraccion1.sumar(fraccion2));
        System.out.println("Resta: " + fraccion1.restar(fraccion2));
        System.out.println("Multiplicación: " + fraccion1.multiplicar(fraccion2));
        System.out.println("División: " + fraccion1.dividir(fraccion2));

        System.out.println("¿Las fracciones son iguales? " + fraccion1.equals(fraccion2));

        scanner.close();
    }
}
