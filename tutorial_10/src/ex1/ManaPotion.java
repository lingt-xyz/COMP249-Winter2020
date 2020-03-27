package ex1;

/**
 * ManaPotion class, extends Consumable, implements Collectible
 * @author Benjamin Vial
 * @version 0.1
 * @see Consumable, Collectible, String
 *
 */
public class ManaPotion extends Consumable {
	private int manaRestored;
	
	/**
	 * Constructor
	 * @param itemID item's ID
	 * @param itemName item's name
	 * @param manaRestored mana restored by the item
	 */
	public ManaPotion(long itemID, String itemName, int manaRestored) {
		super(itemID, itemName);
		this.manaRestored = manaRestored;
	}
}
