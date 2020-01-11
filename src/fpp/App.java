package fpp;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World! This is a real program.");	
		
		String fileName = "restaurants.txt";
		int resultsLimit = 3;
		
		Randomizer randomizer = new Randomizer(resultsLimit, fileName);
		randomizer.printAll();
	}

}
