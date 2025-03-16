import model.*;
import vista.Vista;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Controlador {
    private static Scanner scanner = new Scanner(System.in);
    private static CarretCompra carret = new CarretCompra();

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
                    OpcioProducteControlador();
                    break;
                case 2:
                    carret.passarPerCaixa();
                    break;
                case 3:
                    carret.mostrarCarret();
                    break;
                case 0:
                    System.out.println("Acabant...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
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
                    afegirAlimentacio();
                    break;
                case 2:
                    afegirTextil();
                    break;
                case 3:
                    afegirElectronica();
                    break;
                case 0:
                    System.out.println("Tornant al menú inicial...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (option != 0);
    }

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static void afegirAlimentacio() {
        System.out.print("Nom del producte: ");
        String nom = scanner.nextLine();
        System.out.print("Codi de barres: ");
        String codiBarres = scanner.nextLine();
        System.out.print("Preu: ");
        double preu = scanner.nextDouble();
        scanner.nextLine();

        LocalDate dataCaducitat = null;
        boolean dataValida = false;

        while (!dataValida) {
            System.out.print("Data de caducitat (dd/mm/yyyy): ");
            String inputData = scanner.nextLine();
            try {
                dataCaducitat = LocalDate.parse(inputData, FORMAT);
                dataValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Format incorrecte! Torna a introduir la data (dd/mm/yyyy).");
            }
        }

        carret.afegirProducte(new Alimentacio(nom, codiBarres, preu, dataCaducitat));
        System.out.println("Producte afegit al carret!");
    }

    private static void afegirTextil() {
        System.out.print("Nom del producte: ");
        String nom = scanner.nextLine();
        System.out.print("Codi de barres: ");
        String codiBarres = scanner.nextLine();
        System.out.print("Preu: ");
        double preu = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Composició tèxtil: ");
        String composicioTextil = scanner.nextLine();

        carret.afegirProducte(new Textil(nom, codiBarres, preu, composicioTextil));
        System.out.println("Producte afegit al carret!");
    }

    private static void afegirElectronica() {
        System.out.print("Nom del producte: ");
        String nom = scanner.nextLine();
        System.out.print("Codi de barres: ");
        String codiBarres = scanner.nextLine();
        System.out.print("Preu: ");
        double preu = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Dies de garantia: ");
        int diesGarantia = scanner.nextInt();
        scanner.nextLine();

        carret.afegirProducte(new Electronica(nom, codiBarres, preu, diesGarantia));
        System.out.println("Producte afegit al carret!");
    }
}
