public abstract class Hoagie {

	//
	// TemplateMethod
	//

	final void templateMethod() {

		// Definitively must be done
		cutBun();

		//
		// Options
		//

		if (customerWantsMeat()) {
			addMeat();
		}

		if (customerWantsCheese()) {
			addCheese();
		}

		if (customerWantsVegetables()) {
			addVegetables();
		}

		if (customerWantsCondiments()) {
			addCondiments();
		}

		// Definitively must be done
		wrapTheHoagie();

	}

	// Definitively must be done
	public void cutBun() {
		System.out.println("The Hoagie is cut");
	}

	// Definitively must be done
	public void wrapTheHoagie() {
		System.out.println("Wrap the hoagie");
	}

	abstract void addMeat();

	abstract void addCheese();

	abstract void addVegetables();

	abstract void addCondiments();

	//
	// Hooks
	//

	boolean customerWantsMeat() {
		return true;
	}

	boolean customerWantsCheese() {
		return true;
	}

	boolean customerWantsVegetables() {
		return true;
	}

	boolean customerWantsCondiments() {
		return true;
	}

}
