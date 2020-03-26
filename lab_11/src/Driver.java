/**
 * @author Ling
 * @version 2020 Winter semester
 * @Date 2020-March-26
 */
public class Driver {

    public static void main(String[] args) {
        Player p = new Player(2000, "name2000");
        Player p2 = new Player(1000, "name1000");
        Player p3 = new Player(500, "name500");
        Player p4 = new Player(5000, "name5000");
        LinkedList list = new LinkedList();
        list.insert(p);
        System.out.println(list);
        list.remove(p);
        System.out.println(list);
        list.insert(p2);
        System.out.println(list);
        list.insert(p3);
        System.out.println(list);
        list.insert(p4);
        System.out.println(list);
        list.remove(p2);
        System.out.println(list);
    }
}
