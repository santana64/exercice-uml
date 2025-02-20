public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract int handleRequest(Terrain terrain);
}
