package model;

public class Textil extends Producte {
    private String composicioTextil;

    public Textil(String nom, String codiBarres, double preu, String composicioTextil) {
        super(nom, codiBarres, preu);
        this.composicioTextil = composicioTextil;
    }

    public String getComposicioTextil() { return composicioTextil; }

    public void setComposicioTextil(String composicioTextil) { this.composicioTextil = composicioTextil; }

    @Override
    public double calcularPreu() {
        return preu; // No té cap càlcul addicional
    }

    @Override
    public String toString() {
        return super.toString() + ", Composició: " + composicioTextil;
    }
}
