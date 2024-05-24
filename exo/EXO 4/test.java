public class TestDao {
    public static void main(String[] args) {
        JoueurDao joueurDao = new JoueurDaoImpl();
        System.out.println("Liste initiale des joueurs :");
        for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
            System.out.println(joueur.getPrenom() + " - " + joueur.getCash());
        }

        // Ajout de 100€ à chaque joueur
        joueurDao.getTousLesJoueurs().forEach(joueur -> {
            joueur.setCash(joueur.getCash() + 100);
            joueurDao.updateJoueur(joueur);
        });

        // Affichage après mise à jour
        System.out.println("Liste des joueurs après mise à jour :");
        for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
            System.out.println(joueur.getPrenom() + " - " + joueur.getCash());
        }

        // Suppression d'un joueur
        Joueur joueurASupprimer = joueurDao.getTousLesJoueurs().get(0);
        joueurDao.deleteJoueur(joueurASupprimer);

        // Affichage final
        System.out.println("Liste des joueurs après suppression de " + joueurASupprimer.getPrenom() + " :");
        for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
            System.out.println(joueur.getPrenom() + " - " + joueur.getCash());
        }
    }
}
