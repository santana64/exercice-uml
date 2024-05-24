import java.util.ArrayList;
import java.util.List;

public class JoueurDaoImpl implements JoueurDao {
    private List<Joueur> joueurs;

    public JoueurDaoImpl() {
        joueurs = new ArrayList<>(); // Initialisation avec quelques joueurs prédéfinis pour le test.
        joueurs.add(new Joueur("Alice", 1500));
        joueurs.add(new Joueur("Bob", 1500));
        joueurs.add(new Joueur("Charlie", 1500));
    }

    @Override
    public List<J

oueur> getTousLesJoueurs() {
        return new ArrayList<>(joueurs);
    }

    @Override
    public void updateJoueur(Joueur joueur) {
        for (int i = 0; i < joueurs.size(); i++) {
            if (joueurs.get(i).getPrenom().equals(joueur.getPrenom())) {
                joueurs.set(i, joueur);
                break;
            }
        }
    }

    @Override
    public void deleteJoueur(Joueur joueur) {
        joueurs.removeIf(j -> j.getPrenom().equals(joueur.getPrenom()));
    }

    @Override
    public void addJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }
}
