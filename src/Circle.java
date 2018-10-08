public class Circle extends Shape2D{
    private double radius;

    public Circle(Point2D point2D, double radius) {
        super(point2D);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
