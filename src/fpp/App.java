package fpp;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World! This is a real program.");	
		
		String fileName = "restaurants.txt";
		int resultsLimit = 3;
		
		Randomizer randomizer = new Randomizer(resultsLimit, fileName);
		// randomizer.printAll();
		System.out.println("Lets go to " + randomizer.getRandom());
		System.out.println("The top picks are:\n" + randomizer.getRandomLimit());
	}

}
