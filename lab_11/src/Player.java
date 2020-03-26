import java.util.Objects;

/**
 * Define a class called Player that implements Comparable <Player> with health and name attributes and has getter/setter
 * methods to retrieve/access them.
 * Define the appropriate constructors and give it a useful toString() method.
 *
 * @author Ling
 * @version 2020 Winter semester
 * @Date 2020-March-26
 */
public class Player implements Comparable<Player>, Cloneable {

    private int health;
    private String name;

    public Player(int health, String name) {
        this.health = health;
        this.name = name;
    }

    @Override
    public int compareTo(Player o) {
        return this.health - o.health;
    }

    @Override
    public Player clone() {
        return new Player(this.health, this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return health == player.health &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, name);
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
