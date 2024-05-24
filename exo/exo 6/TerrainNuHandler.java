public class TerrainNuHandler extends Handler {
    public TerrainNuHandler(Handler successor) {
        super(successor);
    }

    @Override
    public int handleRequest(Terrain terrain) {
        if (!terrain.estBati()) {
            return terrain.getLoyerDeBase();
        }
        return successor.handleRequest(terrain);
    }
}
