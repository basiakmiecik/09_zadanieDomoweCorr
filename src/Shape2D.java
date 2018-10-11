public abstract class Shape2D extends Shape{
    private Point2D point2D;

    public Shape2D() {
    }

    public Shape2D(Point2D point2D) {
        this.point2D = point2D;
    }

    public Point2D getPoint2D() {
        return point2D;
    }

    public void setPoint2D(Point2D point2D) {
        this.point2D = point2D;
    }
}
