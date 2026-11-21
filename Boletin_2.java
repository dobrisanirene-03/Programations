/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Boletin_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Apto para conducir (AptoConducir.java)
        System.out.print("Introduce el nombre: ");
        String nombre = teclado.next();
        System.out.print("Introduce la edad: ");
        int edadConducir = teclado.nextInt();

        if (edadConducir < 0) {
            System.out.println("Error: No se puede introducir una edad negativa. Fin de la ejecución.");
        } else {
            System.out.print("¿Tiene carnet de conducir? (true/false): ");
            boolean tieneCarnet = teclado.nextBoolean();
            System.out.print("¿Tiene el certificado médico en vigor? (true/false): ");
            boolean tieneCertificado = teclado.nextBoolean();

            if (edadConducir >= 18 && tieneCarnet && tieneCertificado) {
                System.out.println(nombre + " ES APTO para conducir.");
            } else {
                System.out.println(nombre + " NO ES APTO para conducir.");
            }
        }

        // 2. Calculadora (Calculator.java)
        int opcion;
        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            double num1 = 0, num2 = 0;
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer numero: ");
                num1 = teclado.nextDouble();
                System.out.print("Escriba el segundo numero: ");
                num2 = teclado.nextDouble();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir un número entre 0.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Error: La opcion introducida no es válida.");
            }
        } while (opcion != 5);

        // 3. Entradas de espectáculo (EspectEntry.java)
        System.out.print("Introduce el precio de una entrada: ");
        double precioEntrada = teclado.nextDouble();
        System.out.print("Introduce el numero de entradas a comprar (max. 4): ");
        int numEntradas = teclado.nextInt();

        if (numEntradas >= 1 && numEntradas <= 4) {
            double subtotal = precioEntrada * numEntradas;
            double descuento = 0;

            switch (numEntradas) {
                case 1:
                    descuento = 0;
                    break;
                case 2:
                    descuento = subtotal * 0.10;
                    break;
                case 3:
                    descuento = subtotal * 0.15;
                    break;
                case 4:
                    descuento = subtotal * 0.20;
                    break;
            }

            double totalPagar = subtotal - descuento;
            System.out.println("El importe total a pagar es: " + totalPagar + " €");
        } else {
            System.out.println("Error: Solo se pueden comprar hasta 4 entradas.");
        }

        // 4. Jornada laboral (JornFabix.java)
        System.out.print("Introduce las horas trabajadas en el tramo diurno: ");
        int horasDiurnas = teclado.nextInt();
        System.out.print("Introduce las horas trabajadas en el tramo nocturno: ");
        int horasNocturnas = teclado.nextInt();

        double bruto = (horasDiurnas * 12) + (horasNocturnas * 20);
        double neto;

        if (bruto > 120) {
            neto = bruto - (bruto * 0.05);
        } else {
            neto = bruto;
        }
        System.out.println("El importe total a cobrar es: " + neto + " euros");

        // 5. Mayor de tres números (MalorDTs.java)
        System.out.print("Introduce el numero A: ");
        double a = teclado.nextDouble();
        System.out.print("Introduce el numero B: ");
        double b = teclado.nextDouble();
        System.out.print("Introduce el numero C: ");
        double c = teclado.nextDouble();

        if (a >= b && a >= c) {
            System.out.println("El numero mayor entre A, B y C es " + a + "el numero A");
        } else if (b >= a && b >= c) {
            System.out.println("El numero mayor entre A, B y C es " + b + "el numero B");
        } else {
            System.out.println("El numero mayor entre A, B y C es " + c + "el numero C");
        }

        // 6. Par o impar (ParImpala.java)
        System.out.print("Introduce un numero: ");
        int numParImpar = teclado.nextInt();

        if (numParImpar % 2 == 0) {
            System.out.println("El numero " + numParImpar + " es PAR");
        } else {
            System.out.println("El numero " + numParImpar + " es IMPAR");
        }

        // 7. Servicio militar (ServicioMilitar.java)
        System.out.print("Introduce la edad de la persona: ");
        int edadMilitar = teclado.nextInt();

        if (edadMilitar > 18 && edadMilitar < 25) {
            System.out.println("La persona es apta para prestar el servicio militar.");
        } else {
            System.out.println("La persona NO es apta para prestar el servicio militar.");
        }

        // 8. Descuento de supermercado (SupermDesc.java)
        System.out.print("Introduce el importe total de la compra: ");
        double importeCompra = teclado.nextDouble();

        // Número aleatorio entre 1 y 100
        int numeroAzar = (int) (Math.random() * 100) + 1;
        System.out.println("Numero de la promocion obtenido: " + numeroAzar);

        double descuentoSuper;
        if (numeroAzar < 60) {
            descuentoSuper = importeCompra * 0.15;
        } else {
            descuentoSuper = importeCompra * 0.20;
        }

        double importeFinal = importeCompra - descuentoSuper;

        System.out.println("Dinero descontado: " + descuentoSuper + " €");
        System.out.println("Importe total a pagar: " + importeFinal + " €");

        teclado.close();
    }
}