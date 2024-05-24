public class PlateauIterator implements Iterator {
    private Plateau plateau;
    private int current = 0;

    public PlateauIterator(Plateau plateau) {
        this.plateau = plateau;
    }

    @Override
    public boolean hasNext() {
        return current < plateau.nbCases();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new RuntimeException("No more cases");
        }
        return plateau.getCase(current++);
    }
}
