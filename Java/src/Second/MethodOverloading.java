package Second;
class B  // Same method name with different parameters is called  Method overloading
{
	void sum() {
		System.out.println("Dwfault method");
		
	}
	void sum(int x) {
		System.out.println(" 1 parameter method");
	
}
	void sum(int x, int y) {
		System.out.println(" 2 parameter method");
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		B obj = new B();
		obj.sum(10);
		
	}
}


