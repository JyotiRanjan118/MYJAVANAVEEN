package Class_13_Interface;

public interface USMedical extends WHO {				//Interface-Interface(extends keyword)
	
	int min_free=10;
	
	public void orthopedicservices();
	
	public void dentalservices();
	
	public void neuroservices();
	
	public void ambulanceservices();
	
	//private void test();						//Error(Private method is not allowed in Interface,because private method cant override)
	
	//no method body -- 100% abstraction
	//only method declaration/method prototype
	//no static methods in Interface  for prototype methods(because we cant override static method)
	//but interface vars static and final in nature by default
	//cant create the object of interface 
	
	
	//can have method body:with default method
	default void Service_911() {						//only default method is allowed in interface
		System.out.println("US -- 911 services");
	}
	
	//2.can have static method in interface
	public static void billing() {
		System.out.println("US -- Billing");
	}
}
