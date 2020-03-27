package ex2;

class InventoryItem implements Comparable<InventoryItem> {
    private String name;
    private int uniqueItemID;

    public InventoryItem() {
        super();
    }

    public InventoryItem(String name, int uniqueItemID) {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueItemID() {
        return uniqueItemID;
    }

    public void setUniqueItemID(int uniqueItemID) {
        this.uniqueItemID = uniqueItemID;
    }

    @Override
    public String toString() {
        return "InventoryItem [name=" + name + ", uniqueItemID=" + uniqueItemID + "]";
    }

    // -1: Object 1 is less than Object 2
    // 0: Object 1 equals Object 2
    // 1: Object 1 is greater than Object 2
    public int compareTo(InventoryItem o) {
        return Integer.compare(this.uniqueItemID, o.getUniqueItemID());
    }
}
