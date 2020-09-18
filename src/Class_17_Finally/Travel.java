package Class_17_Finally;

public class Travel {
		public static void main(String[] args) {
			
			//Employee e=new Employee();
			Travel t=new Travel();
			t=null;
			
			//Requesting JVM to call GC
			System.gc();
			System.out.println("Processing done....");
			
			 
		}
		
		@Override
		public void finalize() {
			System.out.println("This is my finalize method");
		}
}
