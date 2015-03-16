// Hoagie == Riesensandwitch
public class ItalianHoagie extends Hoagie {

	String[] meatUsed = { "Salamie", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = { "Provolone" };
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Pappers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	void addMeat() {

		System.out.println("Adding the meat: ");

		for (String meat : meatUsed) {
			System.out.println(meat + " ");
		}

	}

	@Override
	void addCheese() {

		System.out.println("Adding the cheese: ");

		for (String cheese : cheeseUsed) {
			System.out.println(cheese + " ");
		}

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
