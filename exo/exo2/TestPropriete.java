public class TestPropriete {
    public static void main(String[] args) {
        Propriete terrain = ProprieteFactory.creerPropriete("terrain", 400, "Rue de la Paix");
        Propriete gare = ProprieteFactory.creerPropriete("gare", 200, "Gare Montparnasse");

        terrain.afficher();
        gare.afficher();
    }
}
