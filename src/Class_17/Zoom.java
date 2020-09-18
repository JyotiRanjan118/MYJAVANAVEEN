package Class_17;

public class Zoom {
	
	public static void main(String[] args) {
		
		Meeting m = new Meeting(450, "test1234");
		
		System.out.println(m.id);
		//System.out.println(m.password);
		m.start();
		
		System.out.println(m.studentCount);
	}
}
