package constructor.day2;

public class Hospital {
	String patientName;
	int age;
	Hospital(){
		System.out.println("****Welcome to Sevasadan Hospital****");
	}
	Hospital(String patientName, int age){
		this.patientName= patientName;
		this.age = age;
	}
	
	public void hospitalInfo() {
		System.out.println("Patient Name : "+ patientName);
		System.out.println("Patient Age : "+ age);
	}

}
