package Class_17_testing;

import Class_17.Meeting;

public class GoToMeeting extends Meeting {
		
	public GoToMeeting(int id, String password) {
		super(id, password);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Meeting m=new Meeting(3433, "test1234");
		
		System.out.println(m.id);
		//System.out.println(m.password);				//cant acccess because it is outside package(private)
		m.start();
		
		//System.out.println(m.studentcount);					//error(studentCount is default)
		
		GoToMeeting gm=new GoToMeeting(1290,"babujrn890");
		System.out.println(gm.isRecorded);
	}
}
