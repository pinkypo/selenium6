package First;
class B{
	int Age;
	int id;
	String name;
	B(int Age, int id){
		this.Age=Age;
		this.id=id;
	}
	public void meth() {
		System.out.println(id+""+Age);
	}
	
	
}

public class Third {

	public static void main(String[] args) {
		B obj = new B(111, 29);
		obj.meth();
		// TODO Auto-generated method stub

	}

}
