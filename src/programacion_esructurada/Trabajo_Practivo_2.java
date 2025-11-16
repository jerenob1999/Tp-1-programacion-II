/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_esructurada;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author jerem
 */
public class Trabajo_Practivo_2 {
 public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (esBisiesto) System.out.println("El año " + anio + " es bisiesto.");
        else System.out.println("El año " + anio + " no es bisiesto.");
    }

    // ===========================
    // 2. MAYOR DE 3 NÚMEROS
    // ===========================
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int mayor = Math.max(a, Math.max(b, c));

        System.out.println("El mayor es: " + mayor);
    }

    // ===========================
    // 3. CLASIFICACIÓN EDAD
    // ===========================
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 12) System.out.println("Eres un Niño.");
        else if (edad <= 17) System.out.println("Eres un Adolescente.");
        else if (edad <= 59) System.out.println("Eres un Adulto.");
        else System.out.println("Eres un Adulto mayor.");
    }

    // ===========================
    // 4. CALCULADORA DE DESCUENTO
    // ===========================
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        char cat = sc.next().toUpperCase().charAt(0);

        double descuento = 0;

        switch (cat) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    // ===========================
    // 5. SUMA DE PARES (while)
    // ===========================
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();

            if (numero % 2 == 0) suma += numero;

        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }

    // ===========================
    // 6. CONTADOR (for)
    // ===========================
    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();

            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    // ===========================
    // 7. VALIDAR NOTA (do-while)
    // ===========================
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10)
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");

        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }

    // ===========================
    // 8. PRECIO FINAL (función)
    // ===========================
    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }

    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese impuesto (%): ");
        double imp = sc.nextDouble() / 100;

        System.out.print("Ingrese descuento (%): ");
        double desc = sc.nextDouble() / 100;

        double resultado = calcularPrecioFinal(base, imp, desc);

        System.out.println("El precio final del producto es: " + resultado);
    }

    // ===========================
    // 9. COSTO ENVÍO + TOTAL
    // ===========================
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) return peso * 5;
        else return peso * 10;
    }

    public static double calcularTotalCompra(double precio, double costoEnvio) {
        return precio + costoEnvio;
    }

    public static void ejercicio9() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();

        sc.nextLine();
        System.out.print("Ingrese la zona (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double envio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, envio);

        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total a pagar es: " + total);
    }

    // ===========================
    // 10. ACTUALIZAR STOCK
    // ===========================
    public static int actualizarStock(int stock, int vendida, int recibida) {
        return stock - vendida + recibida;
    }

    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el stock actual: ");
        int stock = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();

        int nuevoStock = actualizarStock(stock, vendida, recibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    // ===========================
    // 11. DESCUENTO CON VARIABLE GLOBAL
    // ===========================
    static double descuentoGlobal = 0.10;

    public static void ejercicio11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // ===========================
    // 12. ARRAYS
    // ===========================
    public static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    }

    // ===========================
    // 13. ARRAYS + RECURSIVIDAD
    // ===========================
    public static void imprimirRecursivo(double[] arr, int i) {
        if (i == arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimirRecursivo(arr, i + 1);
    }

    public static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }
    
    public static void main(String[] args) {
       
        ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
    }
}
