public class TestPlateau {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        for (int i = 0; i < 10; i++) {
            plateau.ajouterCase(new Case(i, "Case " + i));
        }

        PlateauIterator iterator = plateau.createIterator();
        while (iterator.hasNext()) {
            Case c = (Case) iterator.next();
            c.afficher();
        }
    }
}
