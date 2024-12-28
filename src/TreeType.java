// Paylaşılan durum (Intrinsic State): Ağaç türü ortak şeyler burda
public class TreeType {
    private final String name;
    private final String color;
    private final String texture;
    public TreeType(String name, String color, String texture) {
        this.name=name;
        this.color=color;
        this.texture=texture;
    }
    public void draw(int x, int y){
        System.out.println("Drawing tree '" + name + "' at (" + x + ", " + y +
                ") with color " + color + " and texture " + texture);
    }

/*    public void accept(TreeVisitor visitor){
        //Tree türüne göre ziyaretçi çağırıyor
        if(this.name=="Oak"){
            visitor.visitOakTree((OakTree) this); //oak treeyi ziyaret et
        }
        else if (this.name=="Pine"){
            visitor.visitPineTree((PineTree) this); //pine treeyi ziyaret et
        }
    }*/
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
}
