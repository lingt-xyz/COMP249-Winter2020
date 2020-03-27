public class Rectangle extends Shape implements ShapeInterface {
    Rectangle(int h, int w) {
        super.setHeigth(h);
        super.setWidth(w);
    }

    public String printShape() {
        String out = "";
        for (int i = 0; i < this.getHeigth(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                out += "#";
            }
            out += "\n";
        }
        return out;
    }
}
