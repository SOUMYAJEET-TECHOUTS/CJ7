package javacollections;
import java.util.HashSet;
public class HashSet1 {
	public static void main(String[] args) {
	    HashSet<String> bikes = new HashSet<String>();
	    bikes.add("Hero");
	    bikes.add("BMW");
	    bikes.add("Honda");
	    bikes.add("Suzuki");
	    bikes.add("Ktm");
	    System.out.println(bikes);
	    
	    
	    //remove
	    
	    bikes.remove("Hero");
	    System.out.println(bikes);
	    
	    //add
	    
	    bikes.add("Hayabusa");
	    bikes.add("Hayabusa");
	    System.out.println(bikes);
	  }
	}

