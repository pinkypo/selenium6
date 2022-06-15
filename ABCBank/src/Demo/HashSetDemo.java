package Demo;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> al=new HashSet<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("B");
		for(String s:al)
		{
			System.out.println(s);
		}

	}


}



