package vista;

public class Vista {
    public static void menuInici() {
        System.out.println("\nBENVINGUT AL SUPERMERCAT");
        System.out.println("1) Introduir producte");
        System.out.println("2) Passar per caixa");
        System.out.println("3) Mostrar carret de compra");
        System.out.println("0) Acabar");
        System.out.print("Selecciona una opció: ");
    }

    public static void menuProducte() {
        System.out.println("\n--- PRODUCTE ---");
        System.out.println("1) Alimentació");
        System.out.println("2) Tèxtil");
        System.out.println("3) Electrònica");
        System.out.println("0) Tornar");
        System.out.print("Selecciona una opció: ");
    }
}
