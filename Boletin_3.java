/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Boletin_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU BOLETIN 3 ===");
            System.out.println("1. Comparar dos numeros enteros");
            System.out.println("2. Comprobar si el primero es multiplo del segundo");
            System.out.println("3. Comprobar si alguno de los dos es multiplo del otro");
            System.out.println("4. Ordenar tres caracteres de mayor a menor");
            System.out.println("5. Numero de cifras entre 0 y 9999");
            System.out.println("6. Calificacion segun nota numerica");
            System.out.println("7. Comparar area de triangulo y circulo");
            System.out.println("8. Comprobar si la suma de dos numeros da el tercero");
            System.out.println("9. Piedra, papel o tijera");
            System.out.println("10. Signo de un numero real");
            System.out.println("0. Salir");
            System.out.print("Elige un ejercicio: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1(teclado);
                case 2 -> ejercicio2(teclado);
                case 3 -> ejercicio3(teclado);
                case 4 -> ejercicio4(teclado);
                case 5 -> ejercicio5(teclado);
                case 6 -> ejercicio6(teclado);
                case 7 -> ejercicio7(teclado);
                case 8 -> ejercicio8(teclado);
                case 9 -> ejercicio9(teclado);
                case 10 -> ejercicio10(teclado);
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    // 1. Comparar dos numeros enteros
    public static void ejercicio1(Scanner sc) {
        System.out.println("Introduce el primer numero entero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero entero:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero (" + num1 + ") es mayor que el segundo (" + num2 + ").");
        } else if (num2 > num1) {
            System.out.println("El segundo numero (" + num2 + ") es mayor que el primero (" + num1 + ").");
        } else {
            System.out.println("Ambos numeros son iguales.");
        }
    }

    // 2. Comprobar si el primero es multiplo del segundo
    public static void ejercicio2(Scanner sc) {
        System.out.println("Introduce el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " SI es multiplo de " + num2);
        } else {
            System.out.println(num1 + " NO es multiplo de " + num2);
        }
    }

    // 3. Comprobar si alguno de los dos es multiplo del otro
    public static void ejercicio3(Scanner sc) {
        System.out.println("Introduce el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = sc.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede calcular multiplos con el numero cero.");
        } else if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Al menos uno de los numeros es multiplo del otro.");
        } else {
            System.out.println("Ninguno de los numeros es multiplo del otro.");
        }
    }

    // 4. Ordenar tres caracteres de mayor a menor
    public static void ejercicio4(Scanner sc) {
        System.out.println("Introduce el primer caracter:");
        char c1 = sc.next().charAt(0);
        System.out.println("Introduce el segundo caracter:");
        char c2 = sc.next().charAt(0);
        System.out.println("Introduce el tercer caracter:");
        char c3 = sc.next().charAt(0);
        char aux;

        if (c1 < c2) { aux = c1; c1 = c2; c2 = aux; }
        if (c1 < c3) { aux = c1; c1 = c3; c3 = aux; }
        if (c2 < c3) { aux = c2; c2 = c3; c3 = aux; }

        System.out.println("Caracteres ordenados de mayor a menor: " + c1 + ", " + c2 + ", " + c3);
    }

    // 5. Numero de cifras entre 0 y 9999
    public static void ejercicio5(Scanner sc) {
        System.out.println("Introduce un numero entero entre 0 y 9999:");
        int num = sc.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("El numero esta fuera del rango permitido (0 a 9999).");
        } else if (num < 10) {
            System.out.println("El numero tiene 1 cifra.");
        } else if (num < 100) {
            System.out.println("El numero tiene 2 cifras.");
        } else if (num < 1000) {
            System.out.println("El numero tiene 3 cifras.");
        } else {
            System.out.println("El numero tiene 4 cifras.");
        }
    }

    // 6. Calificacion segun nota numerica
    public static void ejercicio6(Scanner sc) {
        System.out.println("Introduce la nota numerica del alumno:");
        double grade = sc.nextDouble();

        if (grade < 0 || grade > 10) {
            System.out.println("Nota invalida. Debe estar entre 0 y 10.");
        } else if (grade < 5) {
            System.out.println("INSUFICIENTE");
        } else if (grade < 6) {
            System.out.println("SUFICIENTE");
        } else if (grade < 7) {
            System.out.println("BIEN");
        } else if (grade < 9) {
            System.out.println("NOTABLE");
        } else {
            System.out.println("SOBRESALIENTE");
        }
    }

    // 7. Comparar area de triangulo y circulo
    public static void ejercicio7(Scanner sc) {
        System.out.println("Introduce la base del triangulo:");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura del triangulo:");
        double height = sc.nextDouble();
        double triangleArea = (base * height) / 2;

        System.out.println("Introduce el radio del circulo:");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("Area del triangulo: " + triangleArea);
        System.out.println("Area del circulo: " + circleArea);

        if (triangleArea > circleArea) {
            System.out.println("El area del triangulo es mayor.");
        } else if (circleArea > triangleArea) {
            System.out.println("El area del circulo es mayor.");
        } else {
            System.out.println("Ambas areas son iguales.");
        }
    }

    // 8. Comprobar si la suma de dos numeros da el tercero
    public static void ejercicio8(Scanner sc) {
        System.out.println("Introduce el primer numero:");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int n2 = sc.nextInt();
        System.out.println("Introduce el tercer numero:");
        int n3 = sc.nextInt();

        if ((n1 + n2 == n3) || (n1 + n3 == n2) || (n2 + n3 == n1)) {
            System.out.println("Si, la suma de dos de ellos da como resultado el otro.");
        } else {
            System.out.println("No, ningun par sumado da como resultado el tercero.");
        }
    }

    // 9. Piedra, papel o tijera
    public static void ejercicio9(Scanner sc) {
        System.out.println("Jugador 1 - Introduce PIEDRA, PAPEL o TIJERA:");
        String player1 = sc.next().toUpperCase();
        System.out.println("Jugador 2 - Introduce PIEDRA, PAPEL o TIJERA:");
        String player2 = sc.next().toUpperCase();

        if (player1.equals(player2)) {
            System.out.println("Empate!");
        } else if ((player1.equals("PIEDRA") && player2.equals("TIJERA")) ||
                   (player1.equals("PAPEL") && player2.equals("PIEDRA")) ||
                   (player1.equals("TIJERA") && player2.equals("PAPEL"))) {
            System.out.println("Gana el Jugador 1!");
        } else if ((player2.equals("PIEDRA") && player1.equals("TIJERA")) ||
                   (player2.equals("PAPEL") && player1.equals("PIEDRA")) ||
                   (player2.equals("TIJERA") && player1.equals("PAPEL"))) {
            System.out.println("Gana el Jugador 2!");
        } else {
            System.out.println("Opcion u opciones no validas introducidas.");
        }
    }

    // 10. Signo de un numero real
    public static void ejercicio10(Scanner sc) {
        System.out.println("Escribe un numero real:");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("El numero es POSITIVO.");
        } else if (num < 0) {
            System.out.println("El numero es NEGATIVO.");
        } else {
            System.out.println("El numero es CERO.");
        }
    }
}