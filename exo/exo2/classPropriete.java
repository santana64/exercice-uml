public abstract class Propriete {
    protected int prix;
    protected String nom;

    public Propriete(int prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void afficher();
}
