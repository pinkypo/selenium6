package Demo;

import java.util.ArrayList;

class EMP {
	String name;// insilizing varriables
	int id, age;
	EMP(String name, int id, int age)// we are creating a constructor
	{
		this.name=name;  // decalaring a variables
		this.age=age;
		this.id=id;;
		
	}

}


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EMP> al= new ArrayList<EMP>();
		al.add(new EMP("dhru",300,24));
	}

}
