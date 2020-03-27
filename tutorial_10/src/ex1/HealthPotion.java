package ex1;

/**
 * HealthPotion class, extends Consumable, implements Collectible
 * @author Benjamin Vial
 * @version 0.1
 * @see Consumable, Collectible, String
 *
 */
public class HealthPotion extends Consumable {
	private int healthRestored;
	
	/**
	 * Constructor
	 * @param itemID item's ID
	 * @param itemName item's name
	 * @param healthRestored health restored by the item
	 */
	public HealthPotion(long itemID, String itemName, int healthRestored) {
		super(itemID, itemName);
		this.healthRestored = healthRestored;
	}
}
