/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Boletin_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU BOLETIN 4 ===");
            System.out.println("1. Menu calculadora (A-D)");
            System.out.println("2. Suma de dos tiradas de dado en texto");
            System.out.println("0. Salir");
            System.out.print("Elige un ejercicio: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1(teclado);
                case 2 -> ejercicio2(teclado);
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    // 1. Menu calculadora (Ej2MenuCalc.java)
    public static void ejercicio1(Scanner teclado) {
        System.out.print("Introduce el primer numero: ");
        double num1 = teclado.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        double num2 = teclado.nextDouble();

        System.out.println("====================");
        System.out.println("MENU DE OPCIONES:");
        System.out.println("A. SUMAR LOS NUMEROS");
        System.out.println("B. RESTAR LOS NUMEROS");
        System.out.println("C. MULTIPLICAR LOS NUMEROS");
        System.out.println("D. DIVIDIR LOS NUMEROS");
        System.out.print("Selecciona una opcion (A, B, C, D): ");
        char opcionMenu = teclado.next().charAt(0);

        double resultado;
        switch (Character.toUpperCase(opcionMenu)) {
            case 'A':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 'B':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 'C':
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 'D':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la division es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opcion incorrecta. No se realizara ninguna operacion.");
                break;
        }
    }

    // 2. Suma de dos tiradas de dado en texto (Ej3TDado.java)
    public static void ejercicio2(Scanner teclado) {
        teclado.nextLine(); // Limpiar salto de linea pendiente

        System.out.print("Introduce el resultado de la primera tirada (\"UNO\", \"DOS\", ..., \"SEIS\"): ");
        String tirada1Str = teclado.nextLine().trim().toUpperCase();

        System.out.print("Introduce el resultado de la segunda tirada (\"UNO\", \"DOS\", ..., \"SEIS\"): ");
        String tirada2Str = teclado.nextLine().trim().toUpperCase();

        int valor1 = 0;
        int valor2 = 0;

        switch (tirada1Str) {
            case "UNO": valor1 = 1; break;
            case "DOS": valor1 = 2; break;
            case "TRES": valor1 = 3; break;
            case "CUATRO": valor1 = 4; break;
            case "CINCO": valor1 = 5; break;
            case "SEIS": valor1 = 6; break;
            default: System.out.println("Valor 1 introducido incorrecto, se contara como 0."); break;
        }

        switch (tirada2Str) {
            case "UNO": valor2 = 1; break;
            case "DOS": valor2 = 2; break;
            case "TRES": valor2 = 3; break;
            case "CUATRO": valor2 = 4; break;
            case "CINCO": valor2 = 5; break;
            case "SEIS": valor2 = 6; break;
            default: System.out.println("Valor 2 introducido incorrecto, se contara como 0."); break;
        }

        int suma = valor1 + valor2;
        System.out.println("La suma de las dos tiradas en formato numerico es: " + suma);
    }
}