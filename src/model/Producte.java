package model;

public abstract class Producte {
    protected String nom;
    protected String codiBarres;
    protected double preu;

    public Producte(String nom, String codiBarres, double preu) {
        this.nom = nom;
        this.codiBarres = codiBarres;
        this.preu = preu;
    }

    public String getNom() { return nom; }
    public String getCodiBarres() { return codiBarres; }
    public double getPreu() { return preu; }

    public void setNom(String nom) { this.nom = nom; }
    public void setCodiBarres(String codiBarres) { this.codiBarres = codiBarres; }
    public void setPreu(double preu) { this.preu = preu; }

    // Mètode abstracte que serà implementat a les subclasses
    public abstract double calcularPreu();

    @Override
    public String toString() {
        return "Nom: " + nom + ", Codi: " + codiBarres + ", Preu: " + preu;
    }
}
