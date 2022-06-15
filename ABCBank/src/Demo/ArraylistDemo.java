package Demo;

import java.util.ArrayList;
//import java.util.Arrays;

public class ArraylistDemo {
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		//by using reamove we can remove element
		al.remove("D");
		System.out.println("No of elements:"+al.size());
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
