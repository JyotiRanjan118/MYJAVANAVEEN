package Class_13_Interface;

public class TestHospital {
	public static void main(String[] args) {
		FortisHospital fs=new FortisHospital();
		
		fs.orthopedicservices();
		fs.dentalservices();
		fs.neuroservices();
		fs.ambulanceservices();
		fs.physioservices();
		fs.ENTServices();
		fs.pediatriservices();
		fs.emergencyservices();
		fs.cardioServices();
		fs.OTPservices();
		fs.medicalInsurance();
		fs.pathologyServices();
		fs.Service_911();					//Default method called from USMedical Interface
		System.out.println();
		
		//USMedical us=new USMedical();		//cant create the object of Interface object
		
		//Top Casting
		USMedical us=new FortisHospital();//child class object can be referred by parent interface ref var
		us.orthopedicservices();
		us.dentalservices();
		us.neuroservices();
		us.ambulanceservices();
		
		System.out.println(USMedical.min_free);
		System.out.println(fs.min_free);
		
		//USMedical.min_free=100;		error(The interface variable cant be changed ,because it is by default static and Final)
		
		final int i=10;
		//i=20;							error(the variable is final so cant be chaged latter)
		
		//new USMedical();				error(Cant create the object of Interface)
		
		USMedical.billing();			//Static method is called from USMedical interface
		
		
		
		
							
	}
}
