/**
 * Define a class called LinkedList with an inner nested class Node.
 * Class LinkedList has two attributes ( Node head and int size ).
 *
 * @author Ling
 * @version 2020 Winter semester
 * @Date 2020-March-26
 */
public class LinkedList {
    Node head;
    int size;

    /**
     * insert() method must be ordered. This means that your newly
     * added Node should be placed in an ordered fashion such that your resulting
     * linked list is ALWAYS sorted by the Player ’s health .
     *
     * @param p
     */
    boolean insert(Player p) {
        if (p == null) {
            return false;
        }

        Node node = new Node(p.clone());
        if (head == null) {
            head = node;
            size++;
            return true;
        } else if (head.player.compareTo(p) >= 0) {
            node.next = head;
            head = node;
            size++;
            return true;
        }
        Node pointer = head;
        while (pointer.next != null && pointer.next.player.compareTo(p) < 0) {
            pointer = pointer.next;
        }
        Node next = pointer.next;
        pointer.next = node;
        node.next = next;
        size++;
        return true;
    }

    boolean remove(Player p) {
        if (head == null || p == null) {
            return false;
        }
        Node pointer = head;
        do {
            if (pointer.player.equals(p)) {
                head = head.next;
                size--;
                return true;
            }
            pointer = pointer.next;
        } while (pointer != null);
        return false;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("LinkedList{[");
        Node pointer = head;
        while (pointer != null) {
            sb.append(pointer.player + "->");
            pointer = pointer.next;
        }
        sb.append("], size=" + size +
                '}');
        return sb.toString();
    }

    /**
     * The Node class has private attributes ( Player player; Node next; ).
     * Define the appropriate constructor and toString() methods.
     */
    class Node {
        private Player player;
        private Node next;

        Node(Player player) {
            this.player = player;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "player=" + player +
                    '}';
        }
    }
}
