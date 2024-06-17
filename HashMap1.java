package javacollections;
import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		 
        
       
        map.put("soumya" , 10);
        map.put("sachin" , 40);
        map.put("deepak" , 30);
        map.put("Raja"   , 50);
       
        System.out.println("Size of map is:- "
                           + map.size());
 
        
        System.out.println(map);
 
       
        if (map.containsKey("sachin")) {
 
           
            Integer a = map.get("sachin");
 
          
            System.out.println("value for key Sachin Is="
                                 + a);
            
        }
        
        //updatethevalue
        map.put("Surya", 50);
        System.out.println(map);
        
        
      //remove
        
        
       map.remove("Raja");
    	System.out.println(map.containsKey("Raja"));
    	 System.out.println(map);
    	 
    	 //calling by constructor
    	 
    	 HashMap<String, Integer> map1 = new HashMap<>(map);
    	 System.out.println(map1);
    	 
    	//update value
    	 
    	 HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
       

  
     hm1.put(1, "Tic");
     hm1.put(2, "hello");
     hm1.put(3, "Toe");

     System.out.println("Initial Map " + hm1);

     hm1.put(2, "Tac");

     System.out.println("Updated Map " + hm1);
 }

        
    }
	
	
	
	

	


