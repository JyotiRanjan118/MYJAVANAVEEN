package Class_14_AbstractClass;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Login -- Const");
	}
	
	@Override
	public void header() {
		System.out.println("LP -- Header");
		
	}
	
	@Override
	public void title() {
		System.out.println("LP -- title");
		
	}
	
	/*@Override
	public void logout() {									//Error(Cant override because the logout method in page class is final)
		System.out.println("lp -- logout");
	}*/
	
	
	public static void signUp() {
		System.out.println("page -- sign up");
	}
	
	public HomePage login(String un,String pwd) {
		System.out.println("LP -- login");
		System.out.println("login with "+un+" and "+pwd);
		
		return new HomePage();
	}
		
}
