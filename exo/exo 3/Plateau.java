import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private List<Case> cases;

    public Plateau() {
        this.cases = new ArrayList<>();
    }

    public void ajouterCase(Case c) {
        cases.add(c);
    }

    public Case getCase(int i) {
        return cases.get(i);
    }

    public int nbCases() {
        return cases.size();
    }

    public PlateauIterator createIterator() {
        return new PlateauIterator(this);
    }
}
