public class ProprieteFactory {
    public static Propriete creerPropriete(String type, int prix, String nom) {
        switch (type) {
            case "terrain":
                return new Terrain(prix, nom);
            case "gare":
                return new Gare(prix, nom);
            case "compagnieEE":
                return new CompagnieEE(prix, nom);
            default:
                throw new IllegalArgumentException("Type de propriété inconnu: " + type);
        }
    }
}
