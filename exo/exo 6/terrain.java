public class Terrain {
    private boolean estALaBanque;
    private boolean estHypothéqué;
    private boolean estBati;
    private int loyerDeBase;
    private int nombreMaisons;

    // Constructeur par défaut
    public Terrain() {
    }

    // Getters
    public boolean isEstALaBanque() {
        return estALaBanque;
    }

    public boolean isEstHypothéqué() {
        return estHypothéqué;
    }

    public boolean isEstBati() {
        return estBati;
    }

    public int getLoyerDeBase() {
        return loyerDeBase;
    }

    public int getNombreMaisons() {
        return nombreMaisons;
    }

    // Setters
    public void setEstALaBanque(boolean estALaBanque) {
        this.estALaBanque = estALaBanque;
    }

    public void setEstHypothéqué(boolean estHypothéqué) {
        this.estHypothéqué = estHypothéqué;
    }

    public void setEstBati(boolean estBati) {
        this.estBati = estBati;
    }

    public void setLoyerDeBase(int loyerDeBase) {
        this.loyerDeBase = loyerDeBase;
    }

    public void setNombreMaisons(int nombreMaisons) {
        this.nombreMaisons = nombreMaisons;
    }

    public int calculerLoyer() {
       
        return loyerDeBase + nombreMaisons * 50; 
    }
}
