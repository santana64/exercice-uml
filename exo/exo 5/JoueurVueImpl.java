public class J
oueurVueImpl implements JoueurVue {
    @Override
    public void afficherJoueur(String prenom, int cash) {
        System.out.println("Joueur: " + prenom + " - Cash: " + cash);
    }
}
