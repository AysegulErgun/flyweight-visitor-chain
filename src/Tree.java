//paylaşılmayan durum : Her bir ağacın pozisyonu
public class Tree {
    private final int x; //paylaşılmayan durum(pozisyon)
    private final int y; //paylaşılmayan durum

    private final TreeType treeType; //paylaşılan durum(ağaç türü)

    //constructor
    public Tree(int x, int y, TreeType treeType){
        this.x=x;
        this.y=y;
        this.treeType=treeType;

    }
    //ağaç çizen metot
    public void draw(){
        treeType.draw(x,y);
    }

/*   public void accept(TreeVisitor visitor){
        //Tree türüne göre ziyaretçi çağırıyor
        if(this.name=="Oak"){
            visitor.visitOakTree((OakTree) this); //oak treeyi ziyaret et
        }
        else if (this.name=="Pine"){
            visitor.visitPineTree((PineTree) this); //pine treeyi ziyaret et
        }*/
    public void accept(TreeVisitor visitor){
        visitor.visitTree(this);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //ağaç türüne erişim
    public TreeType getTreeType(){
        return treeType;
    }
}
