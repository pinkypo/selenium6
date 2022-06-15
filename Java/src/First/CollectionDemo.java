package First;

//port java.util.ArayList;
import java.util.ArrayList;

class Emp{
	int id;
	String name;
	int age;
	Emp(String name, int id, int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
}

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<Emp> al= new ArrayList<Emp>();
		al.add(new Emp("Neha", 2345, 12));
		al.add(new Emp("Neha", 2345, 12));
		al.add(new Emp("Neha", 2345, 12));
	}

}
