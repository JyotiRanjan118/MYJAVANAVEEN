package Class_12_Inheritance;

public class BMW extends Car {
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoAirsuspension() {
		System.out.println("BMW -- suspension");
	}
}
