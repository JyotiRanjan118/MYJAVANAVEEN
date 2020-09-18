package Class_11;

public class EmployeeProjectTest {
		public static void main(String[] args) {
			
			EmployeeProject obj=new EmployeeProject();
			obj.setName("IBM");
			obj.setTotalemp(5000);
			obj.setBudget(10000);
			obj.setProjects("AI-ROBOTICS");
			
			System.out.println(obj.getName());
			System.out.println(obj.getTotalemp());
			System.out.println(obj.getBudget());
			System.out.println(obj.getProjects());
		}
}
