public class BanqueHandler extends Handler {
    public BanqueHandler(Handler successor) {
        super(successor);
    }

    @Override
    public int handleRequest(Terrain terrain) {
        if (terrain.estALaBanque()) {
            return 0;
        }
        return successor.handleRequest(terrain);
    }
}
