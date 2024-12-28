//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    TreeFactory treeFactory = new TreeFactory();

    // Orman fabrikası üzerinden ağaç türlerini alıyoruz
        TreeType oakTreeType  = treeFactory.getTreeType("Oak","green","rough");
        TreeType pineTreeType = treeFactory.getTreeType("Pine","dark green","smooth");

        // Ormanda farklı konumlara ağaçlar yerleştiriyoruz
        Tree oakTree = new Tree(10,20,oakTreeType);

        Tree pineTree = new Tree(20,40,pineTreeType);

//        //ağaçları çiziyoruz
//        oakTree.draw();
//
//        pineTree.draw();

        //ziyaretçi deseni ağaçları ziyaret etme

        TreeVisitor visitor = new ConcreteTreeVisitor();
        oakTree.accept(visitor);
        pineTree.accept(visitor);


        //sorumluluk zinciri oluştur- işlemcileri tanımlıyoruz
        TreeHandler watcher = new TreeWatcherHandler();
        TreeHandler cutter = new TreeCutterHandler();

        //zinciri bağlıyoruz
        watcher.setNextHandler(cutter);

        //işlemci üzerinden ağaçları işliyoruz.
        watcher.handleRequest(oakTree);//izleme ve kesme işlemleri

        watcher.handleRequest(pineTree);







    }
}