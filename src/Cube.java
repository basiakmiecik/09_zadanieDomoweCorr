public class Cube extends Shape3D{
    private double width;

    public Cube(Point3D point3D, double width) {
        super(point3D);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
