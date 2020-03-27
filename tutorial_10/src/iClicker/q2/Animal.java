package iClicker.q2;

public class Animal {
    private class InnerCat {
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        // How can we instantiate an Innercat?
        InnerCat cat = animal.new InnerCat();
        // Animal.InnerCat cat = new animal.InnerCat();
        // InnerCat cat = this.new InnerCat();
        //InnerCat cat = new InnerCat();
    }
}
