package model;

import java.time.LocalDate;

public class Alimentacio extends Producte implements Comparable<Alimentacio> {
    private LocalDate dataCaducitat;

    public Alimentacio(String nom, String codiBarres, double preu, LocalDate dataCaducitat) {
        super(nom, codiBarres, preu);
        this.dataCaducitat = dataCaducitat;
    }

    public LocalDate getDataCaducitat() { return dataCaducitat; }

    public void setDataCaducitat(LocalDate dataCaducitat) { this.dataCaducitat = dataCaducitat; }

    @Override
    public double calcularPreu() {
        long diesCaducitat = LocalDate.now().until(dataCaducitat).getDays();
        if (diesCaducitat < 0) diesCaducitat = 0;  // Evita valors negatius
        return preu - preu * (1.0 / (diesCaducitat + 1)) + (preu * 0.1);
    }

    @Override
    public int compareTo(Alimentacio altre) {
        return this.dataCaducitat.compareTo(altre.dataCaducitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de caducitat: " + dataCaducitat;
    }
}
