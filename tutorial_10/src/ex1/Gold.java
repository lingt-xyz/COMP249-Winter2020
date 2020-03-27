package ex1;

/**
 * Gold class, implements Collectible
 * @author Benjamin Vial
 * @version 0.1
 * @see Collectible, String
 *
 */
public class Gold implements Collectible {
	int value;
	
	public Gold(int value) {
		this.value = value;
	}
	
	/**
	 * Print out "Picked up " + gold value
	 */
	@Override
	public void pickup() {
		System.out.println("Picked up " + this);
	}
	
	/**
	 * Print out "Dropped " + gold value
	 */
	@Override
	public void drop() {
		System.out.println("Dropped " + this);
	}
	
	/**
	 * Return gold value
	 */
	@Override
	public String toString() {
		return this.value + " gold.";
	}
}
