package Second;
class E{
	int x;// instance variables
	int y;
	E() {// constructor without parameters is called default constructor
		
	}
  E(int x, int y)// is parameterized constructor
  {
	 this.x=x; // local variables
	 this.y=y;
	  
  }
void sum() {
	System.out.println("Sum of:"+(x+y));
}
}


public class ConsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj = new E();
		obj.sum();
		E obj1 = new E(10,20);
		obj.sum();

	}

}
