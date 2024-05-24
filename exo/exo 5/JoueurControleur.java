public class JoueurControleur {
    private Joueur modele;
    private JoueurVue vue;

    public JoueurControleur(Joueur modele, JoueurVue vue) {
        this.modele = modele;
        this.vue = vue;
    }

    public void setPrenomJoueur(String prenom) {
        modele.setPrenom(prenom);
        miseAJourVue();
    }

    public void setCashJoueur(int cash) {
        modele.setCash(cash);
        miseAJourVue();
    }

    public void miseAJourVue() {
        vue.afficherJoueur(modele.getPrenom(), modele.getCash());
    }
}
