package javacollections;
import java.util.*;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Vector<String> v1 = new Vector<String>();
		v.add(1);
		v.add(9);
		v.add(7);
		v.add(5);
		v.add(3);
		System.out.println(v);
		
		v.remove(0);
		System.out.println(v);
		
		
		for(int i = 0; i<v.size(); i++)
		{
			System.out.println(v.get(i) + "  ");
			
		}
		
		Collections.sort(v);
		System.out.println(v);
		
		v1.add("Tic-");
		v1.add("Toe");
		v1.add(1,"Tac-");
		for (String str : v1)
            System.out.print(str);
		
		
	}

}
