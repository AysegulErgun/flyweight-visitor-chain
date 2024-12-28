// Ağaç İzleyici
class TreeWatcherHandler extends TreeHandler {
    @Override
    public void handleRequest(Tree tree) {
        System.out.println("Watching tree at position (" + tree.getX() + ", " + tree.getY() + ")");
        if (nextHandler != null) {
            nextHandler.handleRequest(tree);  // İşlemi bir sonraki işleyiciye ilet
        }
    }
}
