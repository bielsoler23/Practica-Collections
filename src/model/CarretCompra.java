package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CarretCompra {
    private List<Producte> productes;
    private Map<String, Integer> quantitats;

    public CarretCompra() {
        this.productes = new ArrayList<>();
        this.quantitats = new HashMap<>();
    }

    public void afegirProducte(Producte producte) {
        if (quantitats.containsKey(producte.getCodiBarres())) {
            quantitats.put(producte.getCodiBarres(), quantitats.get(producte.getCodiBarres()) + 1);
        } else {
            productes.add(producte);
            quantitats.put(producte.getCodiBarres(), 1);
        }
    }

    public boolean estaBuit() {
        return productes.isEmpty();
    }

    public void mostrarCarret() {
        if (estaBuit()) {
            System.out.println("El carret està buit.");
            return;
        }
        System.out.println("Carret de compra:");
        for (Producte p : productes) {
            System.out.println(p.getNom() + " -> " + quantitats.get(p.getCodiBarres()));
        }
    }

    public void passarPerCaixa() {
        if (estaBuit()) {
            System.out.println("El carret està buit. No es pot generar un tiquet.");
            return;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dataActual = LocalDate.now().format(formatter);

        System.out.println("Tiquet de compra");
        System.out.println("Data: " + dataActual);
        double total = 0;
        for (Producte p : productes) {
            int quantitat = quantitats.get(p.getCodiBarres());
            double preuUnitari = p.calcularPreu();
            double preuTotal = preuUnitari * quantitat;
            total += preuTotal;

            System.out.printf("%-10s %d \t%.3f\t%.3f\n", p.getNom(), quantitat, preuUnitari, preuTotal);
        }

        System.out.printf("Total: %.3f\n", total);
        productes.clear();
        quantitats.clear();
    }
}
