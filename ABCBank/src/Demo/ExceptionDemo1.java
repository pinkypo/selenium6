package Demo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   
	   int x=10; // i miss semicolcum it is complie time error
		int y=0;   // we are defined inside a main is called local variables
		int z=x/y;
		System.out.println("z value is :"+z);
		System.out.println("*******End of try block*******");
   }
	   
   
   catch(ArithmeticException e)// we are specifiying what type of exception
   {
   System.out.println(e);
   System.out.println("*******End of Catch block*******");
   
	}

}
}