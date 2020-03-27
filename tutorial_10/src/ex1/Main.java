package ex1;

/**
 * Driver class for coding exercises 1 of
 * tutorial 10 (interfaces & inner classes)
 * @author Benjamin Vial
 * @version 0.1
 * @see Consumable, Collectible, Gold, String
 *
 */
public class Main {
	public static void main(String[] args) {
		// create an array of Collectibles
		Collectible collectibles[] = new Collectible[5]; 

		// populate the array with some objects
		collectibles[0] = new Gold(30);
		collectibles[1] = new Gold(15);
		collectibles[2] = new HealthPotion(4000, "Minor Health Potion", 10);
		collectibles[3] = new HealthPotion(4100, "Large Health Potion", 100);
		collectibles[4] = new ManaPotion(5000, "Medium Mana Potion", 50);

		// output Collectible information
		for (Collectible coll : collectibles) {
			coll.pickup();
			coll.drop();
		}

	}
}
