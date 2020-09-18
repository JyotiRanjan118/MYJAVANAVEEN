package Practyc;

import java.util.ArrayList;

class Employee{
		String ename;
		int age;
		char gender;
		boolean isPermanent;
}
public class PractycJAVA {
		public static void main(String[] args) {
			Employee e1=new Employee();
			
			e1.ename="Jyoti";
			e1.age=27;
			e1.gender='m';
			e1.isPermanent=true;
			
			System.out.println();
			
			Employee e2=new Employee();
			e2.ename="Dibya";
			e2.age=28;
			e2.gender='m';
			e2.isPermanent=true;
			
			System.out.println();
			
			Employee e3=new Employee();
			e3.ename="op";
			e3.age=24;
			e3.gender='m';
			e3.isPermanent=true;
			
			System.out.println(e1.ename+" "+e1.age+" "+e1.gender+" "+e1.isPermanent);
			System.out.println(e2.ename+" "+e2.age+" "+e2.gender+" "+e2.isPermanent);
			System.out.println(e3.ename+" "+e3.age+" "+e3.gender+" "+e3.isPermanent);
			
			e1=e2;
			e2=e3;
			e3=e1;
			
			System.out.println(e1.ename);
			System.out.println(e2.ename);
			System.out.println(e3.ename);
			
			new Employee().ename="po";
			new Employee().age=50;
			
			System.out.println();
			
			System.gc();
		}
}
