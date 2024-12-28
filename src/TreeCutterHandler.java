public class TreeCutterHandler extends TreeHandler{

    @Override
    public void handleRequest(Tree tree) {
        System.out.println("Cutting tree at position (" + tree.getX() + ", " + tree.getY() + ")");
        if(nextHandler!=null){
            nextHandler.handleRequest(tree);//işlemi bir sonraki işleyiciye ilet
        }
    }
}
