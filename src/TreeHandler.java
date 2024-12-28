//sorumluluk zinciri ağaç işlemcisi
abstract class TreeHandler {
    protected TreeHandler nextHandler; //sonraki işlemci

    public void setNextHandler(TreeHandler nextHandler){
        this.nextHandler=nextHandler;
    }
    public abstract void handleRequest(Tree tree);
}
