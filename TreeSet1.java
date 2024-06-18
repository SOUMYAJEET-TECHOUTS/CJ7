package javacollections;
import java.util.*;
public class TreeSet1 {
	public static void main(String[] args) 
    { 
         
        Set<String> h = new TreeSet<>(); 
  
        
        h.add("A"); 
        h.add("C"); 
        h.add("B"); 
  
       
        h.add("C"); 
        h.add("B"); 
        h.add("K");
        h.add("D");
       
        System.out.println(h); 
    } 
}


