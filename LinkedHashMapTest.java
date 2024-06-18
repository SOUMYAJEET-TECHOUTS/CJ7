package javacollections;
import java.util.LinkedHashMap;
public class LinkedHashMapTest {
	public static void main(String[] args) {
		
	

	LinkedHashMap<String, String> hm1 
    = new LinkedHashMap<String, String>(); 

 
 
           hm1.put("one" , "hello"); 
           hm1.put("two" , "how are you"); 
           hm1.put("four", "thank you"); 


System.out.println(hm1); 


System.out.println("Getting value for key 'one': "
                   + hm1.get("one")); 

System.out.println("Size of the map: "
                   + hm1.size()); 

System.out.println("Is map empty? "
                   + hm1.isEmpty()); 
System.out.println("Contains key 'two'? "
        + hm1.containsKey("two")); 


System.out.println("Contains key 'five'? "
                   + hm1.containsKey("five")); 


System.out.println("delete element 'two': "
                   + hm1.remove("two")); 

System.out.println("Mappings of LinkedHashMap : "
                   + hm1); 
	}
}
