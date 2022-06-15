package Demo;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
			   
			   int x=10; // i miss semicolcum it is complie time error
				int y=2;   // we are defined inside a main is called local variables
				int z=x/y;
				int a[] = {1,2,3,4};
				a[9]=15;
				System.out.println("z value is :"+z);
				System.out.println("*******End of try block*******");
		   }
			   
		   
		   catch(ArithmeticException e)// we are specifiying what type of exception
		 // this exception will handele only runtime exception
		   {
		   System.out.println(e);
		   System.out.println("*******End of Catch block1*******");
		   
			}
		 catch(ArrayIndexOutOfBoundsException ae)// we are specifiying what type of exception
		 // this exception will handele only runtime exception
		   {
		   System.out.println(ae);
		   System.out.println("*******End of the Catch block 2*******");

		}
		

	}




}
