public class ShapeCalculator implements Calc3D, Calc2D{
    double vol;
    double area;
    /*@Override
    public double ballVolume(Ball ball) {
         vol= 4/3*Math.PI*Math.pow(ball.getRadius(),3);
        return vol;
    }

    @Override
    public double cubeVolume(Cube cube) {
        vol=Math.pow(cube.getWidth(),3);
        return vol;
    }*/

    @Override
    public double volume(Shape3D shape3D) {
        if(shape3D instanceof Cube){
            vol=Math.pow(((Cube) shape3D).getWidth(),3);
        }else if(shape3D instanceof Ball){
            vol=4/3*Math.PI*Math.pow(((Ball) shape3D).getRadius(),3);
        }
        return vol;
    }


   /* @Override
    public double circleArea(Circle circle) {
        area=Math.PI*Math.pow(circle.getRadius(),2);
        return area;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        area=rectangle.getLength()*rectangle.getWidth();
        return area;
    }*/

    @Override
    public double shapeArea(GeometricShape shape) {
        if(shape instanceof Circle){
       area=((Circle) shape).getRadius()*((Circle) shape).getRadius()*Math.PI;
        }else if(shape instanceof Rectangle){
            area=((Rectangle) shape).getLength()*((Rectangle) shape).getWidth();
        }
        return area;
    }

}
