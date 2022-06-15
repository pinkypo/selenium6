package Second;
class c{
	int a=10;
	int b=20;

void sum() {
	System.out.println("Sum of:"+(a+b));
}
}
public class ConsDemo {
	public static void main(String[] args) {
		c obj = new c();
		obj.sum();        // we can create number of objects witn different name
		c obj1 = new c();
		obj.sum();
		c obj2 = new c();
		obj.sum();
		
	}

}
