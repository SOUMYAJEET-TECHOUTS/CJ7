package javacollections;
import java.util.*;
public class LinkedList1 {
	public static void main(String args[]) 
    { 
        
        LinkedList<String> n = new LinkedList<String>(); 
  
        
        n.add("A"); 
        n.add("B"); 
        n.addLast("C"); 
        n.addFirst("D"); 
        n.add(2, "E"); 
  
        System.out.println(n); 
  
        n.remove("B"); 
        n.remove(3); 
        n.removeFirst(); 
        n.removeLast(); 
  
        System.out.println(n); 
    } 
}
