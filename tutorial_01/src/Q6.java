class Q6{
    public void myMethod(Rectangle rect1, Rectangle rect2){
        rect1 = rect2;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(15, 15);
        Q6 q5 = new Q6();
        q5.myMethod(r1, r2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }

    static class Rectangle{
        private int a;
        private int b;

        public Rectangle(int a, int b){
            this.a = a;
            this.b = b;
        }

        public String toString(){
            return "Result: " + a*b;
        }
    }
}