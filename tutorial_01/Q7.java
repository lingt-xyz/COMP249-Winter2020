class Q7{
    public static void main(String[] args) {
        Animal a = new Animal(2, "Emma", "Red");
        House h1 = new House("Montreal", a);
        a.setAge(3);
        a.setName("Liam");
        a.setColor("White");
        House h2 = new House("Toronto", a);
        System.out.println(h1 + "\n" + h2);
    }

    public static class Animal{
        private int age;
        private String name, color;

        public Animal(int age, String name, String color){
            this.age = age;
            this.name = name;
            this.color = color;
        }

        public String toString(){
            return "Animal: Name: " + this.name + ", Age: " + this.age + ", Color: " + this.color;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setColor(String color){
            this.color = color;
        }
    }

    public static class House{
        private String address;
        private Animal animal;

        public House(String address, Animal animal){
            this.address = address;
            this.animal = animal;
        }

        public String toString(){
            return "House: Address: " + this.address + ", Animal: " + this.animal;
        }

        public String getAddress(){
            return this.address;
        }

        public Animal getAnimal(){
            return this.animal;
        }
    }
}