import java.util.HashMap;
import java.util.Map;
//Flyweight Factory- Orman fabrikası

public class TreeFactory {

    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        //ormandan belli bir ağaç türü alınır
        TreeType treeType = treeTypes.get(name+ "-"+ color +"-"+ texture);

        if(treeType ==null){
            //eğer ağaç türü ormanda yoksa yeni bir TreeType oluştururuz
            treeType = new TreeType(name,color,texture);
            treeTypes.put(name+"-"+color+"-"+texture, treeType); //Bu ağaç tipi ormana ekleniyor.
        }
        return treeType; // aynı ağaç türünü tekrar döndürür.
    }
}
