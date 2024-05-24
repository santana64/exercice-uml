public class CompagnieEE extends Propriete {
    public CompagnieEE(int prix, String nom) {
        super(prix, nom);
    }

    @Override
    public void afficher() {
        System.out.println("Compagnie Électrique: " + nom + ", Prix: " + prix);
    }
}
