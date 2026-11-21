/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examennov;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Boletin_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENU BOLETIN 6 ===");
            System.out.println("1. Convertir segundos a horas, minutos y segundos");
            System.out.println("2. Dias transcurridos desde inicio de ano (meses de 30 dias)");
            System.out.println("3. Comprobar si un numero de 3 cifras es capicua");
            System.out.println("4. Calcular edad exacta a partir de fecha de nacimiento");
            System.out.println("5. Mostrar grafica numerica descendente");
            System.out.println("6. Descomponer numero de 3 cifras (unidad, decena, centena)");
            System.out.println("7. Cuanto falta para 2 o 3 cifras");
            System.out.println("8. Numero entero de dos cifras en letras");
            System.out.println("9. Alumno con mayor nota media (5 alumnos)");
            System.out.println("10. Suma de las cifras de un numero cualquiera");
            System.out.println("0. Salir");
            System.out.print("Elige un ejercicio: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1(teclado);
                case 2 -> ejercicio2(teclado);
                case 3 -> ejercicio3(teclado);
                case 4 -> ejercicio4(teclado);
                case 5 -> ejercicio5();
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

    // 1. Segundos a horas, minutos y segundos
    public static void ejercicio1(Scanner sc) {
        System.out.print("Introduce el total de segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }

    // 2. Dias transcurridos desde inicio de ano (meses de 30 dias)
    public static void ejercicio2(Scanner sc) {
        System.out.print("Introduce el dia actual (1-30): ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes actual (1-12): ");
        int mes = sc.nextInt();

        int diasTranscurridos = (mes - 1) * 30 + dia;
        System.out.println("Han transcurrido " + diasTranscurridos + " dias desde el inicio del ano.");
    }

    // 3. Numero de 3 cifras capicua
    public static void ejercicio3(Scanner sc) {
        System.out.print("Introduce un numero entero de 3 cifras: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int centenas = num / 100;
            int unidades = num % 10;

            if (centenas == unidades) {
                System.out.println("El numero " + num + " ES capicua.");
            } else {
                System.out.println("El numero " + num + " NO es capicua.");
            }
        } else {
            System.out.println("Error: El numero debe tener exactamente 3 cifras.");
        }
    }

    // 4. Edad a partir de fecha de nacimiento y fecha actual
    public static void ejercicio4(Scanner sc) {
        System.out.println("--- Fecha de nacimiento ---");
        System.out.print("Dia: ");
        int diaNac = sc.nextInt();
        System.out.print("Mes: ");
        int mesNac = sc.nextInt();
        System.out.print("Ano: ");
        int anioNac = sc.nextInt();

        System.out.println("--- Fecha actual ---");
        System.out.print("Dia: ");
        int diaAct = sc.nextInt();
        System.out.print("Mes: ");
        int mesAct = sc.nextInt();
        System.out.print("Ano: ");
        int anioAct = sc.nextInt();

        int edad = anioAct - anioNac;

        if (mesAct < mesNac || (mesAct == mesNac && diaAct < diaNac)) {
            edad--;
        }

        System.out.println("La edad de la persona es: " + edad + " anos.");
    }

    // 5. Grafica con bucles
    public static void ejercicio5() {
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // 6. Unidad, decena y centena de un numero de 3 cifras
    public static void ejercicio6(Scanner sc) {
        System.out.print("Introduce un numero de 3 cifras: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int centena = num / 100;
            int decena = (num % 100) / 10;
            int unidad = num % 10;

            System.out.println("Centena: " + centena);
            System.out.println("Decena: " + decena);
            System.out.println("Unidad: " + unidad);
        } else {
            System.out.println("Error: El numero debe tener 3 cifras.");
        }
    }

    // 7. Lo minimo que le falta para ser de 2 o 3 cifras
    public static void ejercicio7(Scanner sc) {
        System.out.print("Introduce un numero natural de hasta 2 cifras (0-99): ");
        int num = sc.nextInt();

        if (num >= 0 && num < 10) {
            int falta = 10 - num;
            System.out.println("Tiene 1 cifra. Le faltan " + falta + " para ser un numero de 2 cifras.");
        } else if (num >= 10 && num <= 99) {
            int falta = 100 - num;
            System.out.println("Tiene 2 cifras. Le faltan " + falta + " para ser un numero de 3 cifras.");
        } else {
            System.out.println("Error: Debes introducir un numero natural de hasta 2 cifras.");
        }
    }

    // 8. Numero entero de dos cifras en letras (sin arrays)
    public static void ejercicio8(Scanner sc) {
        System.out.print("Introduce un numero entero de dos cifras (10-99): ");
        int num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("Error: El numero debe tener dos cifras.");
            return;
        }

        // Casos especiales del 10 al 29
        if (num >= 10 && num <= 29) {
            switch (num) {
                case 10 -> System.out.println("Diez");
                case 11 -> System.out.println("Once");
                case 12 -> System.out.println("Doce");
                case 13 -> System.out.println("Trece");
                case 14 -> System.out.println("Catorce");
                case 15 -> System.out.println("Quince");
                case 16 -> System.out.println("Dieciseis");
                case 17 -> System.out.println("Diecisiete");
                case 18 -> System.out.println("Dieciocho");
                case 19 -> System.out.println("Diecinueve");
                case 20 -> System.out.println("Veinte");
                case 21 -> System.out.println("Veintiuno");
                case 22 -> System.out.println("Veintidos");
                case 23 -> System.out.println("Veintitres");
                case 24 -> System.out.println("Veinticuatro");
                case 25 -> System.out.println("Veinticinco");
                case 26 -> System.out.println("Veintiseis");
                case 27 -> System.out.println("Veintisiete");
                case 28 -> System.out.println("Veintiocho");
                case 29 -> System.out.println("Veintinueve");
            }
        } else {
            int decena = num / 10;
            int unidad = num % 10;
            String textoDecena = "";
            String textoUnidad = "";

            switch (decena) {
                case 3 -> textoDecena = "Treinta";
                case 4 -> textoDecena = "Cuarenta";
                case 5 -> textoDecena = "Cincuenta";
                case 6 -> textoDecena = "Sesenta";
                case 7 -> textoDecena = "Setenta";
                case 8 -> textoDecena = "Ochenta";
                case 9 -> textoDecena = "Noventa";
            }

            switch (unidad) {
                case 1 -> textoUnidad = "uno";
                case 2 -> textoUnidad = "dos";
                case 3 -> textoUnidad = "tres";
                case 4 -> textoUnidad = "cuatro";
                case 5 -> textoUnidad = "cinco";
                case 6 -> textoUnidad = "seis";
                case 7 -> textoUnidad = "siete";
                case 8 -> textoUnidad = "ocho";
                case 9 -> textoUnidad = "nueve";
            }

            if (unidad == 0) {
                System.out.println(textoDecena);
            } else {
                System.out.println(textoDecena + " y " + textoUnidad);
            }
        }
    }

    // 9. Alumno con la mayor nota media de 5 alumnos (sin arrays)
    public static void ejercicio9(Scanner sc) {
        String mejorAlumno = "";
        double mayorNota = -1.0;

        for (int i = 1; i <= 5; i++) {
            sc.nextLine(); // Limpiar salto de linea pendiente
            System.out.print("Introduce el nombre del alumno " + i + ": ");
            String nombre = sc.nextLine();

            double nota;
            do {
                System.out.print("Introduce la nota media de " + nombre + " (0 - 10): ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: La nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);

            if (nota > mayorNota) {
                mayorNota = nota;
                mejorAlumno = nombre;
            }
        }

        System.out.println("El alumno con mayor nota media es " + mejorAlumno + " con un " + mayorNota + ".");
    }

    // 10. Suma de las cifras de un numero cualquiera
    public static void ejercicio10(Scanner sc) {
        System.out.print("Introduce un numero entero cualquiera: ");
        int num = Math.abs(sc.nextInt()); // Math.abs por si introducen negativos
        int suma = 0;

        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }

        System.out.println("La suma de sus cifras es: " + suma);
    }
}