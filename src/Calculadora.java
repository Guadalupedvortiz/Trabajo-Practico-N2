import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner youtube = new Scanner(System.in);

        System.out.println("Ingrese Número 1: ");
        int numero1 = youtube.nextInt();
        System.out.println("Ingrese Número 2: ");
        int numero2 = youtube.nextInt();

        int opcion;

        do {
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");

            System.out.println("\nIngrese una opción: ");
            opcion = youtube.nextInt();
        } while (opcion < 1 || opcion > 5);

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + ((double) numero1 / numero2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            case 5:
                System.out.println("Gracias!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        youtube.close();
    }
}