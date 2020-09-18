package Class_16_ExceptionHandling;

public class FinallyConcept {
		
	public static void main(String[] args) {
		
		int p = 20;
		
		try {
			
			System.out.println("in try block");
			int t=p/0;
			
		} catch (NullPointerException e) {
			System.out.println("In catch block");
			System.out.println("null pointer is coming");
		}
		
		finally {
			System.out.println("get lost");
		}

	}
	
}
