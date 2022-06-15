package First;
class C{
	int a;
	int b;
  
  C(int x , int y){
	  x=a;
	  y=b;
  }
   public void meth() {
	   System.out.println("sum of :"+(a+b));
   }

}

public class Second {

	public static void main(String[] args) {
		C obj = new C(20,30);
		obj.meth();
		
		// TODO Auto-generated method stub

	}

}
