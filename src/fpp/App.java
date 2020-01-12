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
		
		// Now creating a restaurant object
		Restaurant pizzaPlaza = new Restaurant("Pizza Plaza", "5555 North Testing Street, CA 91111", "555-5555");
		System.out.println(pizzaPlaza.getName() + " is a new restaurant located in " + pizzaPlaza.getAddress());
		System.out.println("Their phone number is : " + pizzaPlaza.getPhoneNumber());
		pizzaPlaza.increaseRating();
		System.out.println("Unfortunately, they have a poor rating of : " + pizzaPlaza.getRating());
	}

}
