public class Cylinder extends Circle {
    private int h;

    public Cylinder(int x, int y, int r, int h) {
        super(x, y, r);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}