package Demo;

public class Exception7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			   
			   int x=10; // i miss semicolcum it is complie time error
				int y=0;   // we are defined inside a main is called local variables
				int z=x/y;
				System.out.println("z value is :"+z);
				System.out.println("*******End of try block*******");
		   }
		finally{
			System.out.println("*******finally*******");
			// it will not handle exception it will directly go to finally block;
			
		}

	}

}
