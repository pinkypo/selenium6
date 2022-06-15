package First;

public class Car {
	int priceOFCar;// instance variables
	String colour;
	void show() {
		System.out.println("price =   "+priceOFCar);
		System.out.println("colour =  "+colour);
		
	}
	void run() {
		System.out.println("car is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = new Car();
		audi.colour="Black";
		audi.priceOFCar=3000;
		audi.run();
		audi.show();
		

	}

}
