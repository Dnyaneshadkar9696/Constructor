package constructor.day2;

public class MainDay2 {

	public static void main(String[] args) {

		Student s = new Student();
		Student s1 = new Student("Ganesh Kumar", 2);
		s1.studentInfo();

		System.out.println();
		Rectangle ret = new Rectangle(5, 3);
		// this parameters will just show the constructor
		ret.areaofRectangle();
		new Rectangle();
		// calling just the constructor
		System.out.println();

		new Employee();
		Employee emp = new Employee(01, "Ram kumar", 45000.90);
		Employee emp2 = new Employee(02, "Sham Kumar", 45565.90);
		System.out.println();
		emp.empInfo();
		System.out.println();
		emp2.empInfo();
		System.out.println();

		new Car();
		Car ca = new Car("BMW S series", 45000000);
		ca.carInfo();
		
		System.out.println();
	    Account as = new Account(2300000);
	    as.showDefaultBalance();
	    
	    System.out.println();
	    new Library();
	    Library lib = new Library(300, "Ramesh", "Pune");
	   lib.libraryInfo();
	   
	   System.out.println();
	   
	   EvenOdd ev = new EvenOdd(56);
	   ev.evenCheck();
	   
	   System.out.println();
	   PrimeCheck n = new PrimeCheck(567);
	   n.primenumCheck();
	   System.out.println();
	   
	   FactorsofNum f = new FactorsofNum(5);
	   f.getFactor();
	   
	   System.out.println();
	   ReverseNumber rev = new ReverseNumber(123456);
	   rev.reverseNumber();
	   
	   System.out.println();
	   Hcf hc = new Hcf(18, 24);
	   hc.findHcf();
	   
	   System.out.println();
	   Animal an = new Animal();
	   an.sleeping();
	   an.eating();
	   an.runnign();
	   
	   System.out.println();
	   new Hospital();
	   Hospital hs = new Hospital("Sujit Kumar", 34);
	   System.out.println();
	   Hospital hs1 = new Hospital("Raman Donge", 43);
	   hs.hospitalInfo();
	   System.out.println();
	   hs1.hospitalInfo();

	}

}
