import com.company.Aircon; //imports aircon to this class

public class TestFinal {

	public static void main(String[] args) {
		Aircon ac1 = new Aircon(1.5, 19, "Russells");
		System.out.println("Object : ac1 ");
		System.out.println("Brand: " + ac1.getBrand());
		System.out.println("Thermostat: " + ac1.getThermostat());
		System.out.println("HP: " + ac1.getHP());
	}

	Aircon ac2 = new Aircon(2.0, 23, "Hitatchi");
	Aircon ac3 = new Aircon(2.0, 23, "Hitatchi");
}
