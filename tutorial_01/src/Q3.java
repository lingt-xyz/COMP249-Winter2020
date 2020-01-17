public class Q3 {
    private int x = 10;
    public static void main(String[] args) {
        int x = 20;
        change(x);
        System.out.println(x);
    }
    public static void change (int x) {
        x = 30;
    }
}