/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Boletin_T2_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU BOLETIN T2_1 (UD2 - BOLETIN I) ===");
            System.out.println("1. Actividad 1: eco(n)");
            System.out.println("2. Actividad 2: Numeros comprendidos entre dos enteros");
            System.out.println("3. Actividad 3: Area o volumen de un cilindro");
            System.out.println("4. Actividad 4: Mayor de dos enteros");
            System.out.println("5. Actividad 5: Maximo de tres enteros (reutilizando Actividad 4)");
            System.out.println("6. Actividad 6: Comprobar si un caracter es vocal (boolean)");
            System.out.println("7. Actividad 7: Comprobar si un numero es primo");
            System.out.println("8. Actividad 8: Numero de divisores primos de un entero");
            System.out.println("9. Actividad 9: divisoresPrimos() por consola");
            System.out.println("10. Actividad 10: Comprobar si dos enteros positivos son amigos");
            System.out.println("11. Actividad 11: a elevado a n (iterativa y recursiva)");
            System.out.println("12. Actividad 12: Factorial de n recursivamente");
            System.out.println("0. Salir");
            System.out.print("Elige una actividad: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce n: ");
                    int n = teclado.nextInt();
                    eco(n);
                }
                case 2 -> {
                    System.out.print("Introduce el primer entero: ");
                    int a = teclado.nextInt();
                    System.out.print("Introduce el segundo entero: ");
                    int b = teclado.nextInt();
                    mostrarComprendidos(a, b);
                }
                case 3 -> {
                    System.out.print("Introduce opcion (1 para area, 2 para volumen): ");
                    int tipo = teclado.nextInt();
                    System.out.print("Introduce el radio de la base: ");
                    double radio = teclado.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double altura = teclado.nextDouble();
                    calcularCilindro(tipo, radio, altura);
                }
                case 4 -> {
                    System.out.print("Introduce el primer entero: ");
                    int a = teclado.nextInt();
                    System.out.print("Introduce el segundo entero: ");
                    int b = teclado.nextInt();
                    System.out.println("El mayor es: " + mayorDeDos(a, b));
                }
                case 5 -> {
                    System.out.print("Introduce el primer entero: ");
                    int a = teclado.nextInt();
                    System.out.print("Introduce el segundo entero: ");
                    int b = teclado.nextInt();
                    System.out.print("Introduce el tercer entero: ");
                    int c = teclado.nextInt();
                    System.out.println("El maximo de los tres es: " + maximoDeTres(a, b, c));
                }
                case 6 -> {
                    System.out.print("Introduce un caracter: ");
                    char car = teclado.next().charAt(0);
                    System.out.println("Es vocal: " + esVocal(car));
                }
                case 7 -> {
                    System.out.print("Introduce un numero entero: ");
                    int num = teclado.nextInt();
                    System.out.println("Es primo: " + esPrimo(num));
                }
                case 8 -> {
                    System.out.print("Introduce un numero entero: ");
                    int num = teclado.nextInt();
                    System.out.println("Numero de divisores primos: " + contarDivisoresPrimos(num));
                }
                case 9 -> {
                    System.out.print("Introduce un numero entero: ");
                    int num = teclado.nextInt();
                    divisoresPrimos(num);
                }
                case 10 -> {
                    System.out.print("Introduce el primer entero positivo: ");
                    int num1 = teclado.nextInt();
                    System.out.print("Introduce el segundo entero positivo: ");
                    int num2 = teclado.nextInt();
                    System.out.println("Son amigos: " + sonAmigos(num1, num2));
                }
                case 11 -> {
                    System.out.print("Introduce la base real a: ");
                    double a = teclado.nextDouble();
                    System.out.print("Introduce el exponente entero no negativo n: ");
                    int n = teclado.nextInt();
                    if (n < 0) {
                        System.out.println("Error: n debe ser un entero no negativo.");
                    } else {
                        System.out.println("Resultado iterativo: " + potenciaIterativa(a, n));
                        System.out.println("Resultado recursivo: " + potenciaRecursiva(a, n));
                    }
                }
                case 12 -> {
                    System.out.print("Introduce un entero no negativo n: ");
                    int n = teclado.nextInt();
                    if (n < 0) {
                        System.out.println("Error: n debe ser un entero no negativo.");
                    } else {
                        System.out.println(n + "! = " + factorialRecursivo(n));
                    }
                }
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    // Actividad 1: Muestra n veces "Eco..."
    public static void eco(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Eco...");
        }
    }

    // Actividad 2: Muestra todos los numeros comprendidos entre dos enteros
    public static void mostrarComprendidos(int a, int b) {
        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);
        for (int i = inicio + 1; i < fin; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Actividad 3: Calcula y muestra area total (1) o volumen (2) de un cilindro
    public static void calcularCilindro(int opcion, double radio, double altura) {
        if (opcion == 1) {
            double areaTotal = 2 * Math.PI * radio * (altura + radio);
            System.out.println("Area total del cilindro: " + areaTotal);
        } else if (opcion == 2) {
            double volumen = Math.PI * radio * radio * altura;
            System.out.println("Volumen del cilindro: " + volumen);
        } else {
            System.out.println("Opcion no valida. Usa 1 para area o 2 para volumen.");
        }
    }

    // Actividad 4: Devuelve el mayor de dos enteros
    public static int mayorDeDos(int a, int b) {
        return (a >= b) ? a : b;
    }

    // Actividad 5: Maximo de 3 numeros reutilizando mayorDeDos
    public static int maximoDeTres(int a, int b, int c) {
        return mayorDeDos(mayorDeDos(a, b), c);
    }

    // Actividad 6: Indica mediante boolean si el caracter es una vocal
    public static boolean esVocal(char c) {
        char minuscula = Character.toLowerCase(c);
        return minuscula == 'a' || minuscula == 'e' || minuscula == 'i'
                || minuscula == 'o' || minuscula == 'u';
    }

    // Actividad 7: Indica si un numero es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Actividad 8: Devuelve el numero de divisores primos de un entero
    public static int contarDivisoresPrimos(int n) {
        int limite = Math.abs(n);
        int contador = 0;
        for (int i = 1; i <= limite; i++) {
            if (limite % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

    // Actividad 9: Muestra por consola todos los divisores primos del parametro
    public static void divisoresPrimos(int n) {
        int limite = Math.abs(n);
        System.out.print("Divisores primos de " + n + ": ");
        for (int i = 1; i <= limite; i++) {
            if (limite % i == 0 && esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Auxiliar para Actividad 10: Suma de divisores propios (distintos de n)
    private static int sumaDivisoresPropios(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    // Actividad 10: Decide si dos enteros positivos son amigos
    public static boolean sonAmigos(int a, int b) {
        if (a <= 0 || b <= 0) {
            return false;
        }
        return sumaDivisoresPropios(a) == b && sumaDivisoresPropios(b) == a;
    }

    // Actividad 11 (version iterativa): a elevado a n (n >= 0)
    public static double potenciaIterativa(double a, int n) {
        double resultado = 1.0;
        for (int i = 1; i <= n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    // Actividad 11 (version recursiva): a elevado a n (n >= 0)
    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1.0;
        }
        return a * potenciaRecursiva(a, n - 1);
    }

    // Actividad 12: Factorial de n recursivamente (0! = 1)
    public static long factorialRecursivo(int n) {
        if (n == 0) {
            return 1L;
        }
        return n * factorialRecursivo(n - 1);
    }
}
