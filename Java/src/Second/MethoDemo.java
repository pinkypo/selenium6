package Second;

class A{// we are creatning a class
	int x=10;
	int y=10;
	void sum() {
		System.out.println("Sum of:"+(x+y));
	}
	A display() 
	{
		System.out.println("Display method"); // this method will is returning object of a class
		return new A();
	}
}

public class MethoDemo { // here with the help class we are creating a object
	public static void main(String[] args) {
		A obj = new A();
		obj.display().sum();
		
	}

}




