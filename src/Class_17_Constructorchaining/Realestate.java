package Class_17_Constructorchaining;

public class Realestate extends Business {
		
	public Realestate(String type, int revenue, String branches) {				//Error(we have to pass these parameter in object)
		super(type, revenue, branches);
		
	}
	
	public Realestate() {
		System.out.println("Real estate -- default const....");
	}
	
	public static void main(String[] args) {
		Realestate rs=new Realestate("realestate", 10000, "Bangalore");
		System.out.println(rs.type);
		
		Realestate rs1=new Realestate();
		
		
		
		
	}
}
