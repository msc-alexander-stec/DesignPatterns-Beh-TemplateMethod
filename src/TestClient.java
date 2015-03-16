public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: TemplateMethod\n");

		//
		// Create ItalianHoagie
		//

		Hoagie customer1Hoagie = new ItalianHoagie();
		customer1Hoagie.templateMethod();

		System.out.println("\n");

		//
		// Create VeggieHoagie
		//

		Hoagie customer2Hoagie = new VeggieHoagie();
		customer2Hoagie.templateMethod();

	}

}
