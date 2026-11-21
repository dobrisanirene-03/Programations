/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Boletin_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU BOLETIN 5 ===");
            System.out.println("1. Contar numeros positivos hasta negativo");
            System.out.println("2. Estadisticas de 10 numeros (positivos, ceros, negativos)");
            System.out.println("3. Media de numeros positivos hasta negativo");
            System.out.println("4. Mostrar numeros desde 0 hasta N");
            System.out.println("5. Multiplicacion de numeros del 1 al 20");
            System.out.println("6. Numeros pares hasta 20");
            System.out.println("7. Par o impar hasta introducir 0");
            System.out.println("8. Primeros 20 numeros pares");
            System.out.println("9. Suma de numeros del 1 al 20");
            System.out.println("10. Suma de pares y multiplicacion de impares (1 al 20)");
            System.out.println("11. Suma total de numeros positivos hasta negativo");
            System.out.println("0. Salir");
            System.out.print("Elige un ejercicio: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1(teclado);
                case 2 -> ejercicio2(teclado);
                case 3 -> ejercicio3(teclado);
                case 4 -> ejercicio4(teclado);
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7(teclado);
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11(teclado);
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    // 1. Contar positivos hasta negativo (CPos.java)
    public static void ejercicio1(Scanner teclado) {
        int contador = 0;

        System.out.print("Introduce un numero entero positivo (negativo para terminar): ");
        int num = teclado.nextInt();

        while (num >= 0) {
            contador++;
            System.out.print("Introduce otro numero: ");
            num = teclado.nextInt();
        }

        System.out.println("Has introducido " + contador + " numeros positivos.");
    }

    // 2. Estadisticas de 10 numeros (Estad10N.java)
    public static void ejercicio2(Scanner teclado) {
        int sumaPositivos = 0;
        int contCeros = 0;
        int contNegativos = 0;
        int sumaNegativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el numero " + i + ": ");
            int num = teclado.nextInt();

            if (num > 0) {
                sumaPositivos += num;
            } else if (num < 0) {
                sumaNegativos += num;
                contNegativos++;
            } else {
                contCeros++;
            }
        }

        System.out.println("Suma de los numeros positivos: " + sumaPositivos);
        System.out.println("Cantidad de ceros introducidos: " + contCeros);

        if (contNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / contNegativos;
            System.out.println("Media de los numeros negativos: " + mediaNegativos);
        } else {
            System.out.println("No se han introducido numeros negativos para calcular su media.");
        }
    }

    // 3. Media de positivos hasta negativo (MediaPos.java)
    public static void ejercicio3(Scanner teclado) {
        int suma = 0;
        int contador = 0;

        System.out.print("Introduce un numero entero positivo (negativo para terminar): ");
        int num = teclado.nextInt();

        while (num >= 0) {
            suma += num;
            contador++;
            System.out.print("Introduce otro numero: ");
            num = teclado.nextInt();
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los numeros positivos es: " + media);
        } else {
            System.out.println("No se ha introducido ningun numero positivo.");
        }
    }

    // 4. Mostrar hasta N (MostrarHastaN.java)
    public static void ejercicio4(Scanner teclado) {
        System.out.print("Introduce un numero entero positivo: ");
        int num = teclado.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

    // 5. Multiplicacion del 1 al 20 (Mult1Al20.java)
    public static void ejercicio5() {
        long producto = 1;
        for (int i = 1; i <= 20; i++) {
            producto *= i;
        }
        System.out.println("El producto es: " + producto);
    }

    // 6. Pares hasta 20 (ParesH20.java)
    public static void ejercicio6() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    // 7. Par o impar hasta 0 (ParImparH0.java)
    public static void ejercicio7(Scanner teclado) {
        System.out.print("Introduce un numero (0 para terminar): ");
        int num = teclado.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El numero es PAR");
            } else {
                System.out.println("El numero es IMPAR");
            }
            System.out.print("Introduce otro numero: ");
            num = teclado.nextInt();
        }

        System.out.println("Programa finalizado.");
    }

    // 8. Primeros 20 pares (Pr20Pares.java)
    public static void ejercicio8() {
        for (int i = 1; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // 9. Suma del 1 al 20 (S1Al20.java)
    public static void ejercicio9() {
        int suma = 0;
        for (int i = 1; i <= 20; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }

    // 10. Suma de pares y multiplicacion de impares (SParMultImp.java)
    public static void ejercicio10() {
        int sumaPares = 0;
        long multImpares = 1;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                multImpares *= i;
            }
        }

        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Multiplicacion de impares: " + multImpares);
    }

    // 11. Suma total de positivos hasta negativo (SPos.java)
    public static void ejercicio11(Scanner teclado) {
        int suma = 0;

        System.out.print("Introduce un numero entero positivo (negativo para terminar): ");
        int num = teclado.nextInt();

        while (num >= 0) {
            suma += num;
            System.out.print("Introduce otro numero: ");
            num = teclado.nextInt();
        }

        System.out.println("La suma total de los positivos es: " + suma);
    }
}