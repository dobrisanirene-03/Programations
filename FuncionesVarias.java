/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package matematicas;

/**
 * Libreria de funciones matematicas compuestas exclusivamente por metodos estaticos.
 * Trabaja con operaciones aritmeticas (division y modulo) sin conversiones a String.
 */
public class FuncionesVarias {

    // =========================================================================
    // 1. COMPROBACION DE PROPIEDADES NUMERICAS
    // =========================================================================

    /**
     * Devuelve true si el numero long es capicua (se lee igual de izquierda a derecha que de derecha a izquierda).
     *
     * @param x numero a comprobar
     * @return true si es capicua, false en caso contrario
     */
    public static boolean esCapicua(long x) {
        if (x < 0) {
            x = -x;
        }
        return x == voltea(x);
    }

    /**
     * Devuelve true si el numero int es capicua.
     *
     * @param x numero a comprobar
     * @return true si es capicua, false en caso contrario
     */
    public static boolean esCapicua(int x) {
        return esCapicua((long) x);
    }

    /**
     * Devuelve true si el numero long es primo.
     *
     * @param x numero a comprobar
     * @return true si es primo, false en caso contrario
     */
    public static boolean esPrimo(long x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Devuelve true si el numero int es primo.
     *
     * @param x numero a comprobar
     * @return true si es primo, false en caso contrario
     */
    public static boolean esPrimo(int x) {
        return esPrimo((long) x);
    }

    /**
     * Devuelve el numero primo mas pequeno mayor que el valor dado.
     *
     * @param x valor de referencia
     * @return el siguiente numero primo mayor que x
     */
    public static int siguientePrimo(int x) {
        int candidato = (x < 2) ? 2 : x + 1;
        while (!esPrimo((long) candidato)) {
            candidato++;
        }
        return candidato;
    }

    /**
     * Devuelve el numero primo mas grande menor que el valor dado x, si anterior es true,
     * o el primo siguiente a x si anterior es false. Si no existe primo menor que x, devuelve -1.
     *
     * @param x valor de referencia
     * @param anterior true para buscar el primo anterior menor que x, false para el siguiente
     * @return el primo cercano correspondiente o -1 si no existe anterior
     */
    public static int primoCercano(int x, boolean anterior) {
        if (!anterior) {
            return siguientePrimo(x);
        }
        int candidato = x - 1;
        while (candidato >= 2) {
            if (esPrimo((long) candidato)) {
                return candidato;
            }
            candidato--;
        }
        return -1;
    }

    // =========================================================================
    // OPERACIONES MATEMATICAS BASICAS
    // =========================================================================

    /**
     * Calcula la potencia de una base entera elevada a un exponente entero
     * (admite exponente negativo).
     *
     * @param base base de la potencia
     * @param exponente exponente (puede ser positivo, cero o negativo)
     * @return resultado de base elevado a exponente
     */
    public static double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1.0;
        }
        long expAbs = Math.abs((long) exponente);
        double acumulador = 1.0;
        for (long i = 0; i < expAbs; i++) {
            acumulador *= base;
        }
        if (exponente < 0) {
            return 1.0 / acumulador;
        }
        return acumulador;
    }

    // =========================================================================
    // MANIPULACION DE DIGITOS
    // =========================================================================

    /**
     * Cuenta cuantos digitos tiene un numero long.
     *
     * @param x numero del que se cuentan los digitos
     * @return cantidad de digitos de x
     */
    public static int digitos(long x) {
        if (x == 0) {
            return 1;
        }
        long n = (x < 0) ? -x : x;
        int contador = 0;
        while (n > 0) {
            n /= 10;
            contador++;
        }
        return contador;
    }

    /**
     * Cuenta cuantos digitos tiene un numero int.
     *
     * @param x numero del que se cuentan los digitos
     * @return cantidad de digitos de x
     */
    public static int digitos(int x) {
        return digitos((long) x);
    }

    /**
     * Invierte el orden de los digitos de un numero long.
     *
     * @param x numero a voltear
     * @return numero con los digitos invertidos
     */
    public static long voltea(long x) {
        boolean negativo = x < 0;
        long n = negativo ? -x : x;
        long invertido = 0;
        while (n > 0) {
            invertido = invertido * 10 + (n % 10);
            n /= 10;
        }
        return negativo ? -invertido : invertido;
    }

    /**
     * Invierte el orden de los digitos de un numero int.
     *
     * @param x numero a voltear
     * @return numero con los digitos invertidos
     */
    public static int voltea(int x) {
        return (int) voltea((long) x);
    }

    /**
     * Devuelve el digito que ocupa la posicion n (de izquierda a derecha, empezando en 0).
     * Si n esta fuera de rango, devuelve -1.
     *
     * @param x numero de origen
     * @param n posicion del digito (de izquierda a derecha, desde 0)
     * @return el digito en la posicion n o -1 si la posicion no es valida
     */
    public static int digitN(long x, int n) {
        long numAbs = (x < 0) ? -x : x;
        int totalDigitos = digitos(numAbs);
        if (n < 0 || n >= totalDigitos) {
            return -1;
        }
        int saltosDerecha = totalDigitos - 1 - n;
        long divisor = 1;
        for (int i = 0; i < saltosDerecha; i++) {
            divisor *= 10;
        }
        return (int) ((numAbs / divisor) % 10);
    }

    /**
     * Devuelve el digito que ocupa la posicion n (de izquierda a derecha, empezando en 0) para un int.
     *
     * @param x numero de origen
     * @param n posicion del digito (de izquierda a derecha, desde 0)
     * @return el digito en la posicion n o -1 si la posicion no es valida
     */
    public static int digitN(int x, int n) {
        return digitN((long) x, n);
    }

    /**
     * Devuelve la posicion (de izquierda a derecha, empezando en 0) de la primera aparicion
     * del digito d en x, o -1 si no se encuentra.
     *
     * @param x numero en el que se busca
     * @param d digito buscado (0-9)
     * @return posicion de la primera aparicion o -1 si no existe
     */
    public static int posicionDeDigito(long x, int d) {
        if (d < 0 || d > 9) {
            return -1;
        }
        long numAbs = (x < 0) ? -x : x;
        int totalDigitos = digitos(numAbs);
        for (int pos = 0; pos < totalDigitos; pos++) {
            if (digitN(numAbs, pos) == d) {
                return pos;
            }
        }
        return -1;
    }

    /**
     * Devuelve la posicion de la primera aparicion del digito d en un int, o -1 si no se encuentra.
     *
     * @param x numero en el que se busca
     * @param d digito buscado (0-9)
     * @return posicion de la primera aparicion o -1 si no existe
     */
    public static int posicionDeDigito(int x, int d) {
        return posicionDeDigito((long) x, d);
    }

    // =========================================================================
    // MODIFICACION DE NUMEROS
    // =========================================================================

    /**
     * Elimina 1 digito del numero long por detras.
     *
     * @param x numero original
     * @return numero sin su ultimo digito
     */
    public static long quitaPorDetras(long x) {
        return x / 10;
    }

    /**
     * Elimina 1 digito del numero int por detras.
     *
     * @param x numero original
     * @return numero sin su ultimo digito
     */
    public static int quitaPorDetras(int x) {
        return (int) quitaPorDetras((long) x);
    }

    /**
     * Elimina 1 digito del numero long por delante.
     *
     * @param x numero original
     * @return numero sin su primer digito
     */
    public static long quitaPorDelante(long x) {
        return quitaPorDelante(x, 1);
    }

    /**
     * Elimina 1 digito del numero int por delante.
     *
     * @param x numero original
     * @return numero sin su primer digito
     */
    public static int quitaPorDelante(int x) {
        return (int) quitaPorDelante((long) x, 1);
    }

    /**
     * Elimina n digitos del numero long por detras.
     *
     * @param x numero original
     * @param n cantidad de digitos a eliminar por detras
     * @return numero resultante tras quitar n digitos por detras
     */
    public static long quitaPorDetras(long x, int n) {
        if (n <= 0) {
            return x;
        }
        long resultado = x;
        for (int i = 0; i < n; i++) {
            resultado /= 10;
        }
        return resultado;
    }

    /**
     * Elimina n digitos del numero int por detras.
     *
     * @param x numero original
     * @param n cantidad de digitos a eliminar por detras
     * @return numero resultante tras quitar n digitos por detras
     */
    public static int quitaPorDetras(int x, int n) {
        return (int) quitaPorDetras((long) x, n);
    }

    /**
     * Elimina n digitos del numero long por delante.
     *
     * @param x numero original
     * @param n cantidad de digitos a eliminar por delante
     * @return numero resultante tras quitar n digitos por delante
     */
    public static long quitaPorDelante(long x, int n) {
        if (n <= 0) {
            return x;
        }
        boolean negativo = x < 0;
        long numAbs = negativo ? -x : x;
        int totalDigitos = digitos(numAbs);
        if (n >= totalDigitos) {
            return 0;
        }
        int digitosRestantes = totalDigitos - n;
        long divisor = 1;
        for (int i = 0; i < digitosRestantes; i++) {
            divisor *= 10;
        }
        long resultado = numAbs % divisor;
        return negativo ? -resultado : resultado;
    }

    /**
     * Elimina n digitos del numero int por delante.
     *
     * @param x numero original
     * @param n cantidad de digitos a eliminar por delante
     * @return numero resultante tras quitar n digitos por delante
     */
    public static int quitaPorDelante(int x, int n) {
        return (int) quitaPorDelante((long) x, n);
    }

    /**
     * Anade un digito d al final (por detras) del numero long.
     *
     * @param x numero original
     * @param d digito a anadir (0-9)
     * @return numero con el digito anadido por detras
     */
    public static long pegaPorDetras(long x, int d) {
        int digitoAbs = Math.abs(d % 10);
        if (x < 0) {
            return x * 10 - digitoAbs;
        }
        return x * 10 + digitoAbs;
    }

    /**
     * Anade un digito d al final (por detras) del numero int.
     *
     * @param x numero original
     * @param d digito a anadir (0-9)
     * @return numero con el digito anadido por detras
     */
    public static int pegaPorDetras(int x, int d) {
        return (int) pegaPorDetras((long) x, d);
    }

    /**
     * Anade un digito d al principio (por delante) del numero long.
     *
     * @param x numero original
     * @param d digito a anadir (0-9)
     * @return numero con el digito anadido por delante
     */
    public static long pegaPorDelante(long x, int d) {
        int digitoAbs = Math.abs(d % 10);
        boolean negativo = x < 0;
        long numAbs = negativo ? -x : x;
        int totalDigitos = digitos(numAbs);
        long factor = 1;
        for (int i = 0; i < totalDigitos; i++) {
            factor *= 10;
        }
        long resultado = digitoAbs * factor + numAbs;
        return negativo ? -resultado : resultado;
    }

    /**
     * Anade un digito d al principio (por delante) del numero int.
     *
     * @param x numero original
     * @param d digito a anadir (0-9)
     * @return numero con el digito anadido por delante
     */
    public static int pegaPorDelante(int x, int d) {
        return (int) pegaPorDelante((long) x, d);
    }

    /**
     * Extrae una porcion de un numero entre las posiciones inicio y fin (ambas inclusive,
     * de izquierda a derecha empezando en 0). Si las posiciones no son validas, devuelve -1.
     *
     * @param x numero de origen
     * @param inicio posicion inicial (inclusive)
     * @param fin posicion final (inclusive)
     * @return subnumero extraido o -1 si los indices son invalidos
     */
    public static long trozoDeNumero(long x, int inicio, int fin) {
        long numAbs = (x < 0) ? -x : x;
        int totalDigitos = digitos(numAbs);
        if (inicio < 0 || fin < inicio || fin >= totalDigitos) {
            return -1;
        }
        long sinIzquierda = quitaPorDelante(numAbs, inicio);
        int digitosAQuitarDerecha = (totalDigitos - 1) - fin;
        long resultado = quitaPorDetras(sinIzquierda, digitosAQuitarDerecha);
        return (x < 0) ? -resultado : resultado;
    }

    /**
     * Extrae una porcion de un numero int entre las posiciones inicio y fin.
     *
     * @param x numero de origen
     * @param inicio posicion inicial (inclusive)
     * @param fin posicion final (inclusive)
     * @return subnumero extraido o -1 si los indices son invalidos
     */
    public static int trozoDeNumero(int x, int inicio, int fin) {
        return (int) trozoDeNumero((long) x, inicio, fin);
    }

    /**
     * Une dos numeros long formando uno solo.
     *
     * @param x primer numero
     * @param y segundo numero
     * @return numero resultante de concatenar x e y
     */
    public static long juntaNumeros(long x, long y) {
        long yAbs = (y < 0) ? -y : y;
        int digitosY = digitos(yAbs);
        long factor = 1;
        for (int i = 0; i < digitosY; i++) {
            factor *= 10;
        }
        if (x < 0) {
            return x * factor - yAbs;
        }
        return x * factor + yAbs;
    }

    /**
     * Une dos numeros int formando uno solo.
     *
     * @param x primer numero
     * @param y segundo numero
     * @return numero resultante de concatenar x e y
     */
    public static int juntaNumeros(int x, int y) {
        return (int) juntaNumeros((long) x, (long) y);
    }
}
