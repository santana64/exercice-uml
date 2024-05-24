public class JoueurHandler extends Handler {
    public JoueurHandler(Handler successor) {
        super(successor);
    }

    @Override
    public int handleRequest(Terrain terrain) {
        if (terrain.estHypothéqué()) {
            return 0;
        }
        return successor.handleRequest(terrain);
    }
}
