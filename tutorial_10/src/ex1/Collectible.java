package ex1;

/**
 * Collectible interface
 * @author Benjamin Vial
 * @version 0.1
 *
 */
public interface Collectible {
	/**
	 * Print out "Picked up <item info>"
	 */
	public void pickup();
	
	/**
	 * Print out "Dropped <item info>"
	 */
	public void drop();
}
