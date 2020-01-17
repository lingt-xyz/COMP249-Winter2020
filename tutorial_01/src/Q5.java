class Q5{
    public void myMethod(Rectangle rect){
        rect.a = 15;
        rect.b = 15;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 10);
        Q5 q5 = new Q5();
        q5.myMethod(r);
        System.out.println(r.toString());
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