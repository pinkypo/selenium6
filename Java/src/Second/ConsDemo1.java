package Second;
class D
{
	int a;// instance variables
	int b;
	D() {// constructor without parameters is called default constructor
		
	}
  D(int x, int y)// is parameterized constructor
  {
	  x=a;
	  y=b; // local variable
	  
  }
void sum() {
	System.out.println("Sum of:"+(a+b));
}
}


public class ConsDemo1 {
	public static void main(String[] args) {
		D obj = new D(10,20);
		obj.sum();        
		D obj1 = new D(3,5);
		obj.sum();
		
}
}