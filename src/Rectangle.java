public class Rectangle extends Shape2D{
    private double width;
    private double length;

    public Rectangle(Point2D point2D, double width, double length) {
        super(point2D);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
