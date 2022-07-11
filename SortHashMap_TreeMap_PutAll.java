import java.util.*;
public class Main
{
    static Map<String,Integer> map = new HashMap<>();
    
    public static void sortbykey(){
        TreeMap<String,Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
        for(Map.Entry<String,Integer> entry :sorted.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
	public static void main(String[] args) {
		map.put("X",90);
		map.put("A",20);
		map.put("L",30);
		map.put("S",300);
		sortbykey();
	}
}
