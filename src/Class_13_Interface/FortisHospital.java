package Class_13_Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical {
	
	//USMedical services
	@Override
	public void orthopedicservices() {
		System.out.println("FortisHospital -- orthopedicservices--USA");
	}

	@Override
	public void dentalservices() {
		System.out.println("Fortishospital -- dentalservices--USA");
	}

	@Override
	public void neuroservices() {
		System.out.println("Fortishospital -- neuroServices--USA");
	}

	@Override
	public void ambulanceservices() {
		System.out.println("Fortishospital -- ambulanceServices--USA");
		
	}
	
	//UKMedical Services
	@Override
	public void physioservices() {
		System.out.println("FortisHospital -- physioservices--UK");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FortisHospital -- ENTservices--UK");
		
	}

	@Override
	public void pediatriservices() {
		System.out.println("FortisHospital -- pediatriservices--UK");
		
	}
	
	
	//IndianMedical
	@Override
	public void emergencyservices() {
		System.out.println("FortisHospital -- emergencyservices--IndiaMedical");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FortisHospital -- cardioServices--IndianMedical");
		
	}

	@Override
	public void OTPservices() {
		System.out.println("FortisHospital -- OTPservices--IndianMedical");
		
	}
	
	//non overriden methods:
	public void medicalInsurance() {
		System.out.println("FortisHospital -- medicalInsurance");
	}
	
	public void pathologyServices() {
		System.out.println("FortisHospital -- pathologyServices");
	}

	@Override
	public void polioService() {						//Coming from WHO interface
		
		
	}

	
	
	/*@Override
	public static void billing() {						//Error(Static method cant be override)
		System.out.println();
	}*/
	
}
