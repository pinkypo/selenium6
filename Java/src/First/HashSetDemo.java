package First;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> al= new HashSet<String>();
		al.add("a");
		al.add("b");     // Hashset want alow duplicate elements
	    al.add("c");
		al.add("d");
		al.add("a");
		al.add("m");
	    System.out.println("No of elements :"+al.size());
		for(String s:al)
		{
			System.out.println(s);
		}
	
	}
	}


