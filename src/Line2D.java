public class Line2D extends Shape2D{
    private Point2D point2DEnd;

    public Line2D(Point2D point2D, Point2D point2DEnd) {
        super(point2D);
        this.point2DEnd = point2DEnd;
    }

    public Point2D getPoint2DEnd() {
        return point2DEnd;
    }

    public void setPoint2DEnd(Point2D point2DEnd) {
        this.point2DEnd = point2DEnd;
    }
}
