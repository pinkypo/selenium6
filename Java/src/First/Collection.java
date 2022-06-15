package First;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("a");
		al.add("b");     // we are increasing size and decreasing the size automatically by using collection
	     al.add("c");
		al.add("d");
		al.add("a");
		al.remove("b");
		for(String s:al)
		{
			System.out.println(s);
		}
	
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()){
		
	}
{
	System.out.println(itr.hasNext());
}

}
}
