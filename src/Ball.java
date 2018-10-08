public class Ball extends Shape3D{
    private double radius;

    public Ball(Point3D point3D, double radius) {
        super(point3D);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
