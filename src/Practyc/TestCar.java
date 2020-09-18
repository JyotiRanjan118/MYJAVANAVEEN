package Practyc;

public class TestCar {
	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoAirsuspension();
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		System.out.println();
		
	/*	BMW b1=(BMW) new Car();
		b1.autoAirsuspension();
		b1.start();
		b1.stop();
		b1.refuel();*/
		
		Vehicle v1=new Car();
		v1.engine();
		v1.start();	
		
		Vehicle v2=new BMW();
		v2.engine();
		v2.start();
		
		
		
	}
}
