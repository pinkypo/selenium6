package Demo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			LinkedList<String> al=new LinkedList<String>();
			al.add("A");
			al.add("madhu");
			al.add("B");
			al.add("A");
			//al.remove("B");
			System.out.println("No of elements:"+al.size());
			for(String s:al)
			{
				System.out.println(s);
			}

		}

	

	}


