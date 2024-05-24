public class TestChaineResponsabilite {
    public static void main(String[] args) {
        Handler handler = new BanqueHandler(new JoueurHandler(new TerrainNuHandler(new TerrainBatiHandler(null))));
        Terrain terrain = new Terrain();
        terrain.setEstALaBanque(false);
        terrain.setEstHypothéqué(false);
        terrain.setEstBati(true);
        terrain.setLoyerDeBase(200);
        terrain.setNombreMaisons(3);

        int loyer = handler.handleRequest(terrain);
        System.out.println("Le loyer du terrain est: " + loyer);
    }
