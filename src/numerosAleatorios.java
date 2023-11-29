import java.util.Scanner;

public class numerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max, cantidad, cant2;
        int menu;
        boolean salir = false;

        // Menú para elegir entre las funciones.
        do {
            System.out.println("\nMenu:");
            System.out.println("Opcion 1 - Serie de aleatorios enteros");
            System.out.println("Opcion 2 - Serie de aleatorios reales");
            System.out.println("Opcion 3 - Salir");
            System.out.print("Eliga una opción: ");
            menu = sc.nextInt();

            switch (menu) {
                // Primera opción, pide número minino y máximo,
                // así como cantidad de números a mostrar.
                // Y llama a la primera función.
                case 1:
                    System.out.print("\nIntroduzca el numero minimo de la serie: ");
                    min = sc.nextInt();
                    System.out.print("\nIntroduzca el numero maximo de la serie: ");
                    max = sc.nextInt();
                    System.out.print("\nIntroduzca la cantidad de numeros aleatorios que desea: ");
                    cantidad = sc.nextInt();

                    mostrarserie(min, max, cantidad);

                    break;

                // Segunda opción, pide cantidad de números a mostrar
                // Y llama a la función sobrecargada.
                case 2:
                    System.out.print("\nIntroduzca la cantidad de numeros aleatorios que desea: ");
                    cant2 = sc.nextInt();

                    mostrarserie(cant2);

                    break;
                // Tercera opción para salir del programa.
                case 3:
                    System.out.println("Adiós");
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion no válida");

            }

        } while (!salir);
    }

    // Función que muestra una serie aleatoria de números enteros.
    static void mostrarserie(int min, int max, int cantidad) {

        for (int i = 1; i <= cantidad; i++) {
            System.out.println((int) (Math.random() * (max - min + 1) + min));
        }
    }

    // Función sobrecargada que muestra serie aleatoria de números reales.
    static void mostrarserie(double cant2) {
        for (int i = 1; i <= cant2; i++) {
            System.out.println(Math.random());
        }
    }
}
