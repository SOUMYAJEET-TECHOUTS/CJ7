package javacollections;
import java.util.*;
public class ArrayList1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(4);
		System.out.println(list);
		
		//get element
		
		int element = list.get(2);
		System.out.println(element);
		
		//add element in between array
		list.add(2,2);
		list.add(3,3);
		System.out.println(list);
		
		//set element
		list.set(0, 5);
		list.set(4, 0);
		System.out.println(list);
		
		//delete element
		
		list.remove(5);
		System.out.println(list);
		
		//findout size
		
		int size = list.size();
		System.out.println(size);
		
		//loops
		
		for(int i = 0; i<list.size();i++)
		{
			System.out.println(list.get(i) +" ");
		}
		
		//sort
		
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Soumya");
		list1.add("Deepak");
		list1.add("Rakesh");
		list1.add("Sourav");
		System.out.println(list1);
		
		
	}

}
