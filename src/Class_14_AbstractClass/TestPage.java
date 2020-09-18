package Class_14_AbstractClass;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.header();
		lp.title();
		
		HomePage hp=lp.login("admin","admin");
		hp.header();
		hp.title();
		hp.userDetails();
		
		hp.logout();
		lp.logout();
		
		Page p=new LoginPage();
		Page p1=new HomePage();
		
		//Page p=new Page();				//Cant create the object of abstract class
		
		p.header();
		p.title();
		p.logout();
		
		

	}

}
