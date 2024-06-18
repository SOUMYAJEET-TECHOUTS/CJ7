package javacollections;
import java.util.Map;
import java.util.TreeMap;
 

public class TreeMap1 {
       public static void main(String[] args) {
    	  TreeMap<String , Integer> treemap = new TreeMap<>();
    	  treemap.put("A", 1);
          treemap.put("C", 3);
          treemap.put("D", 4);
          treemap.put("E", 9);
          treemap.put("F", 5);
          treemap.put("B", 6);
          System.out.println(treemap);
          
          
          int vlA = treemap.get("A");
          System.out.println("KeyValue of A: " + vlA);
          
          //remove
          
          treemap.remove("B");
          System.out.println(treemap);
          for (String key : treemap.keySet()) {
              System.out.println("Key: " + key + ", Value: " + treemap.get(key));
          }
       }
}
