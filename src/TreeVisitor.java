//ziyaretçi arayüzü:Ziyaretçi deseni, her ağacın üzerinde işlem yapacak bir ziyaretçi nesnesi kullanacaktır.
 //Örneğin, her ağacın tipine göre işlem yapılabilir.
public interface TreeVisitor {
    //Bu arayüz, her tür ağaca özgü işlemleri tanımlar.

//    public void visitOakTree(OakTree oakTree);
//    public void visitPineTree(PineTree pineTree);
    public void visitTree(Tree tree);
}
