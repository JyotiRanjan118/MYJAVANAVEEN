package Class_12_Inheritance;

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
		
		//Top casting
		Car c1=new BMW();
		c1.start();						//Method overide(BMW method II be called)
		c1.stop();
		c1.refuel();
		//c1.autoAirsuspension();		//not allowed(Error)
		
		System.out.println();
		Vehicle v1=new Car();
		v1.engine();
		v1.start();
		Vehicle v2=new BMW();
		v2.engine();
		v2.start();
		
		
		
		
		System.out.println();
		//Down casting
		//BMW b1=new Car();				Not allowed(Will throw Castclassexception)
		//BMW b1=(BMW)new Car();			//Allowed(Not error but it throws exception)
		/*b1.start();
		b1.stop();
		b1.autoAirsuspension();
		b1.refuel();*/
		
		
		
		
	}
}
