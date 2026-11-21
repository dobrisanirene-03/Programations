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

public class Boletin_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Caracteres inversos y suma (CaracteresInversosSum.java)
        System.out.println("Introduce el caracter 1:");
        char c1 = teclado.next().charAt(0);
        System.out.println("Introduce el caracter 2:");
        char c2 = teclado.next().charAt(0);
        System.out.println("Introduce el caracter 3:");
        char c3 = teclado.next().charAt(0);
        System.out.println("Introduce el caracter 4:");
        char c4 = teclado.next().charAt(0);
        System.out.println("Introduce el caracter 5:");
        char c5 = teclado.next().charAt(0);
        System.out.println(c5 + ", " + c4 + ", " + c3 + ", " + c2 + ", " + c1);
        System.out.println("La suma de los numeros es: " + (c5 + c4 + c3 + c2 + c1));

        // 2. Area y perimetro de un circulo (CircAPer.java)
        final double PI = 3.1416;
        System.out.println("Introduce el radio del círculo:");
        double radio = teclado.nextDouble();
        double area = PI * (radio * radio);
        double perimetro = 2 * PI * radio;
        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);

        // 3. Cuadrado de un numero real (CuadradoNumero.java)
        System.out.println("Introduce un numero real:");
        double numReal = teclado.nextDouble();
        System.out.println("El numero multiplicado por sis mismo es: " + (numReal * numReal));

        // 4. Division entera y resto (DivEntera.java)
        System.out.println("Introduce el primer número entero:");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número entero:");
        int num2 = teclado.nextInt();
        System.out.println("Cociente: " + (num1 / num2));
        System.out.println("Resto (modulo): " + (num1 % num2));

        // 5. Doble y triple (DOUBLETRIPL.java)
        System.out.println("Introduce un número entero:");
        int numDobleTriple = teclado.nextInt();
        System.out.println("El doble es: " + (numDobleTriple * 2));
        System.out.println("El triple es: " + (numDobleTriple * 3));

        // 6. Incremento secuencial (IncrSec.java)
        System.out.println("Introduce un número:");
        int numIncr = teclado.nextInt();
        System.out.println("Número inicial: " + numIncr);
        numIncr += 1;
        System.out.println("Tras incrementar en 1: " + numIncr);
        numIncr += 2;
        System.out.println("Tras incrementar en 2: " + numIncr);

        // 7. Nombre y apellidos (MNameLN.java)
        teclado.nextLine(); // Limpiar salto de linea pendiente
        System.out.println("Introduce tu nombre:");
        String nombreCompleto = teclado.nextLine();
        System.out.println("Introduce tu primer apellido:");
        String apellido1 = teclado.nextLine();
        System.out.println("Introduce tu segundo apellido:");
        String apellido2 = teclado.nextLine();
        System.out.println("Nombre completo: " + nombreCompleto + " " + apellido1 + " " + apellido2);

        // 8. Potencias de 7 (PotenciasDeSiete.java)
        System.out.println("Numero: 7");
        System.out.println("7 elevado a 2: " + Math.pow(7, 2));
        System.out.println("7 elevado a 3: " + Math.pow(7, 3));

        // 9. Potencias de un numero introducido (PotenciasNUs.java)
        System.out.println("Introduce un número:");
        double numPot = teclado.nextDouble();
        System.out.println("Número introducido: " + numPot);
        System.out.println("Elevado al cuadrado: " + Math.pow(numPot, 2));
        System.out.println("Elevado al cubo: " + Math.pow(numPot, 3));

        // 10. Saludo personalizado segun edad (SalPers.java)
        teclado.nextLine(); // Limpiar salto de linea pendiente
        System.out.println("Introduce tu nombre:");
        String nombreSaludo = teclado.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = teclado.nextInt();
        if (edad < 20) {
            System.out.println("Hola " + nombreSaludo + ", tienes " + edad + " años, ¡que pequeño eres!");
        } else {
            System.out.println("Hola " + nombreSaludo + ", tienes " + edad + " años, ¡que mayor eres!");
        }

        teclado.close();
    }
}