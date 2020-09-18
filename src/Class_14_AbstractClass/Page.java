package Class_14_AbstractClass;

public abstract class Page {
	
	public Page() {
		System.out.println("Page class Const....");
	}
		
	public abstract void header();
	public abstract void title();
	
	public final void logout() {
		System.out.println("user logged out");
	}
	
	public static void signup() {
		System.out.println("page-- sign up");		//static method is allowed 
	}
}	
