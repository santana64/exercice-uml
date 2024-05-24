public class TerrainBatiHandler extends Handler {
    public TerrainBatiHandler(Handler successor) {
        super(successor);
    }

    @Override
    public int handleRequest(Terrain terrain) {
        if (terrain.estBati()) {
            return terrain.calculerLoyer();
        }
        return successor.handleRequest(terrain);
    }
}
