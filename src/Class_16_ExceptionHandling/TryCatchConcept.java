package Class_16_ExceptionHandling;

public class TryCatchConcept {
		String name="Tom";
	
	public static void main(String[] args) {
		TryCatchConcept obj=new TryCatchConcept();
		
		System.out.println("A");
		
		System.out.println("B");
		
		//JVM II throw an exception withthe help of:
		//1. It will create the object of Exception class
		//2. it will print the exception info with the help of stack trace and 
		// exception handler
		
		try {
			//obj=null;
			System.out.println(obj.name);
			int i=9/0;
		} 
		catch (ArithmeticException e) {
			System.out.println("Some exception occured");
			e.printStackTrace();
			System.out.println(e.getMessage()+" exception got occured...");
		}
		
		catch(NullPointerException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("C");
		System.out.println("C");
		System.out.println("C");
		System.out.println("C");
		
		try {
			
			int p= 9/0;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
