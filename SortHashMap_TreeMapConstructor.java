import java.util.*;
public class Main{
    static Map<String,Integer> map = new HashMap<>();
    static void sortbykey(){
        TreeMap<String,Integer> sorted = new TreeMap<>(map);
        
        for(Map.Entry<String,Integer> entry : sorted.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
    }
    public static void main (String[] args) {
        map.put("x",90);
        map.put("p",30);
        map.put("a",50);
        map.put("k",60);
        sortbykey();
    }
}
