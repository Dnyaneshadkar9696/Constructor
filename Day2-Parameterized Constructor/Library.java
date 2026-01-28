package constructor.day2;

public class Library {

	int numberofBook;
	String librarienName;
	String location;

	Library() {
		System.out.println("Welcome to Seva Sadan Library");
	}

	Library(int numberofBook, String librarienName, String location) {
		this.numberofBook = numberofBook;
		this.librarienName = librarienName;
		this.location = location;

	}
	
	public void libraryInfo() {
		System.out.println("Librarien Name - "+ librarienName);
		System.out.println("Number of bookd - "+ numberofBook);
		System.out.println("Locatioin : "+ location);
	}

}
