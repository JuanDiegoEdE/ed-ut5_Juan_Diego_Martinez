import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("\nElija un término a calcular de la serie Fibonacci: ");
        num = sc.nextInt();

        System.out.println("\n--- El termino " + num + " de la serie Fibonacci es "
                + fibonacci(num) + " ---");
        // System.out.println("El enésimo termino de la serie Fibonacci es" + fibonacci(11);

    }

    // Función recursiva que calcula los términos de la serie Fibonacci.
    static int fibonacci(int num) {
        int resultado;
        if (num == 0) {
            resultado = 0;
            //return 0;
        } else if (num == 1) {
            resultado = 1;
            //return 1;
        }
        // Fibonacci: 0 1 1 2 3 5 8 13 21 34 55 ...

        // Resta el número introducido por teclado menos 1 y menos 2 para encontrar
        // los dos números anteriores de la serie Fibonacci para luego sumarlos y el
        // resultado de ésta suma es el número correspondiente al término introducido.
        else {
            resultado = fibonacci(num - 1) + fibonacci(num - 2);

        }
        return resultado;
    }
}

try {
        num = sc.nextInt();
        } catch (InputMismatchException e) {
        System.out.println("Por favor, ingrese un número válido.");
        return;
        }





