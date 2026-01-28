package constructor.day2;

public class Car {
	
	String modelName;
	int carPrise;
	
	Car(){
		System.out.println("Car started..");
	}
	
	Car(String modelName, int carPrise){
		this.modelName = modelName;
		this.carPrise = carPrise;
	}
	
	public void carInfo() {
		System.out.println("Car Model Name : "+ modelName);
		System.out.println("Car Prise : "+ carPrise);
	}

}
