package model;

public class Electronica extends Producte {
    private int diesGarantia;

    public Electronica(String nom, String codiBarres, double preu, int diesGarantia) {
        super(nom, codiBarres, preu);
        this.diesGarantia = diesGarantia;
    }

    public int getDiesGarantia() { return diesGarantia; }

    public void setDiesGarantia(int diesGarantia) { this.diesGarantia = diesGarantia; }

    @Override
    public double calcularPreu() {
        return preu + preu * (diesGarantia / 365.0) * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dies de garantia: " + diesGarantia;
    }
}
