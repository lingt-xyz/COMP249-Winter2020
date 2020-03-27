package ex2;

public class Main {

	public static void main(String[] args) {
		InventoryItem[] inventoryItems = new InventoryItem[5];
		
		inventoryItems[0] = new InventoryItem("Book", 18);
		inventoryItems[1] = new InventoryItem("Computer", 77);
		inventoryItems[2] = new InventoryItem("Printer", 4);
		inventoryItems[3] = new InventoryItem("Desk", 12);
		inventoryItems[4] = new InventoryItem("Chair", 9);
		
		sort(inventoryItems);
		
		for (int i = 0; i < inventoryItems.length; i++) {			
			System.out.println(inventoryItems[i]);
		}
	}

	public static void sort(Comparable[] objects) {
		for (int i = 0; i < objects.length; i++) {
			for (int j = 0; j < objects.length; j++) {
				if (objects[i].compareTo((InventoryItem) objects[j]) < 0) {
					Comparable tempObject;
					
					tempObject = objects[i];
					objects[i] = objects[j];
					objects[j] = tempObject;
				}
			}
		}
	}
}
