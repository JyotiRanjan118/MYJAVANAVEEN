package Class_16_ExceptionHandling;

public class Training {
	
	String name;
	String course;
	String time;
	
	public Training() {
		
	}
	
	public Training(String name, String course, String time) {
		
		this.name = name;
		this.course = course;
		this.time = time;
	}
	
	
	@Override
	public String toString() {
		return "Training [name=" + name + ", course=" + course + ", time=" + time + "]";
	}

	public static void main(String[] args) {
		
		Training tr=new Training("Naveen","Java","7 AM IST");
		System.out.println(tr.toString());
		System.out.println(tr.name);
	}
}
