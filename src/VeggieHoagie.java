// Hoagie == Riesensandwitch
public class VeggieHoagie extends Hoagie {

	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Pappers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	//
	// Override the not wanted methods
	//

	boolean customerWantsMeat() {
		return false; // Now false
	}

	boolean customerWantsCheese() {
		return false; // Now false
	}

	//
	//
	//

	@Override
	void addMeat() {

		// Empty

	}

	@Override
	void addCheese() {

		// Empty

	}

	@Override
	void addVegetables() {

		System.out.println("Adding the veggies: ");

		for (String veggie : veggiesUsed) {
			System.out.println(veggie + " ");
		}

	}

	@Override
	void addCondiments() {

		System.out.println("Adding the condiments: ");

		for (String condiment : condimentsUsed) {
			System.out.println(condiment + " ");
		}

	}

}
