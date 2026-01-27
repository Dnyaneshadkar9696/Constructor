package Constructor;

public class MainConstructor {
	
	public static void main(String[] args) {
		
		Welcome wel = new Welcome();
		System.out.println();
		
		Program01 pr = new Program01();
		System.out.println();
		
		ConstructorEvencheck ch = new ConstructorEvencheck();
		
		System.out.println();
		
		Student st = new Student();
		st.stuentInfo();
		
		System.out.println();
		Employee em = new Employee();
		
		System.out.println();
		Addition ad = new Addition();
		System.out.println();
		
		Product p = new Product();
		
		
		System.out.println();
		DefaultConstructor de = new DefaultConstructor();
		de.constructorDefault();
		System.out.println();
		
		PrimeNumber prime = new PrimeNumber();
		System.out.println();
		
		RightStar str = new RightStar();
		
		System.out.println();
		
		ReverseTriangle star = new ReverseTriangle();
		System.out.println();
		End en = new End();
		
		
		
		
	}
	

}
