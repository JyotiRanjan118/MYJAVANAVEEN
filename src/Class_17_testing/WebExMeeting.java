package Class_17_testing;

import Class_17.Meeting;

public class WebExMeeting extends Meeting{
		
	public WebExMeeting(int id, String password) {
		super(id, password);
		
	}

	public static void main(String[] args) {
		
		Meeting m=new Meeting(12333,"test1234");
		
		System.out.println(m.id);
		//System.out.println(m.password);		//Error(The password variable is private)
		
		//System.out.println(m.isRecorded);		//Error(isRecorded method is protected),and not extending any class
		
		WebExMeeting wm=new WebExMeeting(1234,"jrn890");
		System.out.println(wm.isRecorded);
		
		
		
	}
}
