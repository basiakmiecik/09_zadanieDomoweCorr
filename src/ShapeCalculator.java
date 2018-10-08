public class ShapeCalculator implements Calc3D, Calc2D{
    double vol;
    double area;
    @Override
    public double ballVolume(Ball ball) {
         vol= 4/3*Math.PI*Math.pow(ball.getRadius(),3);
        return vol;
    }

    @Override
    public double cubeVolume(Cube cube) {
        vol=Math.pow(cube.getWidth(),3);
        return vol;
    }


    @Override
    public double circleArea(Circle circle) {
        area=Math.PI*Math.pow(circle.getRadius(),2);
        return area;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        area=rectangle.getLength()*rectangle.getWidth();
        return area;
    }

    @Override
    public double shapeArea(Shape2D shape2D) {
        if(shape2D instanceof Circle){
        }
        return area;
    }

}
