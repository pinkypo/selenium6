package First;

public class Company {
	int id;
	String cse;
	void show() {
		System.out.println(id=+id);
		System.out.println ("cse= "+cse);
	}
	void run() {
		System.out.println("i am working here");
	}

	public static void main(String[] args) {
		Company obj = new Company();
		obj.id=234;
		obj.cse="swetha";
		obj.run();
		obj.show();
		// TODO Auto-generated method stub

	}

}
