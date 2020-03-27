package iClicker.q3;

public class Main {
    public static void main(String[] args) {
        //StaticInner innerObject = OuterClass.new StaticInner();
        OuterClass.StaticInner innerObject = new OuterClass.StaticInner();
        //StaticInner innerObject = this.new StaticInner();
        //StaticInner innerObject = new OuterClass.StaticInner();
    }
}
