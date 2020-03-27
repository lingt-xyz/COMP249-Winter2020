package ex1;

/**
 * Abstract Consumable class, implements Collectible
 * @author Benjamin Vial
 * @version 0.1
 * @see Collectible, String
 *
 */
abstract public class Consumable implements Collectible {
	protected long itemID;
	protected String itemName;
	
	/**
	 * Constructor
	 * @param itemID item's ID
	 * @param itemName item's name
	 */
	public Consumable(long itemID, String itemName) {
		this.itemID = itemID;
		this.itemName = itemName;
	}
	
	/**
	 * Print out "Picked up " + item's name
	 */
	@Override
	public void pickup() {
		System.out.println("Picked up a " + this);
	}
	
	/**
	 * Print out "Dropped " + item's name
	 */
	@Override
	public void drop() {
		System.out.println("Dropped a " + this);
	}
	
	/**
	 * Return item's name
	 */
	@Override
	public String toString() {
		return this.itemName + ".";
	}
}
