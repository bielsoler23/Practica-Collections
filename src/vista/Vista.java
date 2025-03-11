package vista;

import java.util.Scanner;

public class Vista {
    public static void menuInici() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("BENVINGUT AL SUPERMERCAT");
            System.out.println("-------------");
            System.out.println("--- INICI ---");
            System.out.println("-------------");
            System.out.println("1) Introduir producte");
            System.out.println("2) Passar per caixa");
            System.out.println("3) Mostrar carret de compra");
            System.out.println("0) Acabar");
            System.out.print("Selecciona una opció: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Has seleccionat: Introduir producte");
                    break;
                case 2:
                    System.out.println("Has seleccionat: Passar per caixa");
                    break;
                case 3:
                    System.out.println("Has seleccionat: Mostrar carret de compra");
                    break;
                case 0:
                    System.out.println("Acabant...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Si us plau, selecciona una opció vàlida.");
            }
        } while (option != 0);

        scanner.close();
    }
}
