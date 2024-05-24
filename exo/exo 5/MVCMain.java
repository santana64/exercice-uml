public class MVCMain {
    public static void main(String[] args) {
        // Création du modèle
        Joueur joueur = new Joueur("Alice", 1500);

        // Création de la vue
        JoueurVue vue = new JoueurVueImpl();

        // Création du contrôleur
        JoueurControleur controleur = new JoueurControleur(joueur, vue);

        // Affichage initial des données
        controleur.miseAJourVue();

        // Simulation de modification des données
        controleur.setCashJoueur(joueur.getCash() + 100);
    }
}
