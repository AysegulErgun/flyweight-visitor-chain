//Ağaç Ziyaretçisi  Ağaç Tiplerine Özgü İşlemler
// (ConcreteVisitor): Bu sınıf, farklı ağaç türlerine özgü işlemleri gerçekleştirecektir.
public class ConcreteTreeVisitor implements TreeVisitor {
//    @Override
//    public void visitOakTree(OakTree oakTree) {
//    System.out.println("visiting oak tree with color"+ oakTree.getColor());
//    }
//
//    @Override
//    public void visitPineTree(PineTree pineTree) {
//    System.out.println("visiting pine tree with color "+ pineTree.getColor());
//    }

    @Override
    public void visitTree(Tree tree) {
        TreeType treeType = tree.getTreeType();
        System.out.println("Visiting tree of type'"+ treeType.getName()+"' with color "+ treeType.getColor());
    }
}
