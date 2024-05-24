public class Terrain extends Propriete {
    public Terrain(int prix, String nom) {
        super(prix, nom);
    }

    @Override
    public void afficher() {
        System.out.println("Terrain: " + nom + ", Prix: " + prix);
    }
}
