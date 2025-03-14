import vista.Vista;
import java.util.Scanner;

public class Controlador {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuIniciControlador();
    }

    public static void menuIniciControlador() {
        int option;
        do {
            Vista.menuInici();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nHas seleccionat: Introduir producte");
                    OpcioProducteControlador();
                    break;
                case 2:
                    System.out.println("\nHas seleccionat: Passar per caixa");
                    Vista.PassarPerCaixa();
                    break;
                case 3:
                    System.out.println("\nHas seleccionat: Mostrar carret de compra");
                    Vista.MostrarCarret();
                    break;
                case 0:
                    System.out.println("\nAcabant...");
                    break;
                default:
                    System.out.println("\nOpció no vàlida. Si us plau, selecciona una opció vàlida.");
            }
        } while (option != 0);
    }

    public static void OpcioProducteControlador() {
        int option;
        do {
            Vista.menuProducte();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nHas seleccionat: Alimentació");

                    break;
                case 2:
                    System.out.println("\nHas seleccionat: Tèxtil");
                    break;
                case 3:
                    System.out.println("\nHas seleccionat: Electrònica");
                    break;
                case 0:
                    System.out.println("\nTornant al menú inicial...");
                    break;
                default:
                    System.out.println("\nOpció no vàlida. Si us plau, selecciona una opció vàlida.");
            }
        } while (option != 0);
    }
}
