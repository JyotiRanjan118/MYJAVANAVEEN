package Class_11;

public class Encapsulation {
	public static void main(String[] args) {
		m1();
		Encapsulation en=new Encapsulation();
		en.NS1();
	}
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		m3();
	}

	public static void m3() {
		System.out.println("BYE");
	}
	
	public void NS1() {
		NS2();
	}
	
	public void NS2() {
		NS3();
	}
	
	public void NS3() {
		NS4();
	}
	
	public void NS4() {
		System.out.println("HEYY");
	}
}
