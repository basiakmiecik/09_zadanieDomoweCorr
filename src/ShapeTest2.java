public class ShapeTest2 {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        LineCalc lineCalc= new LineCalc();
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(10, 10);
        Point3D point3D = new Point3D();
        Shape[] shapes = new Shape[6];
        shapes[0] = new Line2D(point2D, point2D1);
        shapes[1] = new Circle(point2D, 10);
        shapes[2] = new Rectangle(point2D, 5, 2);
        shapes[3] = new Ball(point3D, 10);
        shapes[4] = new Cube(point3D, 10);
        shapes[5] = new Circle(point2D1, 10);

        double area;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println("Pole koła o promieniu " + ((Circle) shapes[i]).getRadius() + " położonego w punkcie ("
                        + ((Circle) shapes[i]).getPoint2D().getX2D() + "," + ((Circle) shapes[i]).getPoint2D().getY2D()
                        + "), wynosi: " + shapeCalculator.shapeArea((GeometricShape) shapes[i]));
            }else if(shapes[i] instanceof Rectangle){
                System.out.println("Pole prostokąta o wymiarach " + ((Rectangle) shapes[i]).getWidth()+"x"+
                        ((Rectangle)shapes[i]).getLength()+ " położonego w punkcie ("
                        + ((Rectangle) shapes[i]).getPoint2D().getX2D() + ","
                        + ((Rectangle) shapes[i]).getPoint2D().getY2D()
                        + "), wynosi: " + shapeCalculator.shapeArea((GeometricShape) shapes[i]));
            }else if(shapes[i] instanceof Line2D){
               System.out.println("Dlugość odcinka położonego w punktach ("+
                        + ((Line2D) shapes[i]).getPoint2D().getX2D() + ","
                        + ((Line2D) shapes[i]).getPoint2D().getY2D()+") i ("
                        + ((Line2D) shapes[i]).getPoint2DEnd().getX2D() + ","
                        + ((Line2D) shapes[i]).getPoint2DEnd().getY2D()
                        + "), wynosi: " + lineCalc.lineLength((Line2D)shapes[i]));
            }else if(shapes[i] instanceof Ball){
                System.out.println("Objętość kuli o promieniu "+((Ball) shapes[i]).getRadius() +
                        "której środek jest położony w punkcie ("+(point3D.getX3D()+", "+point3D.getY3D()+" ,"
                        +point3D.getZ3D() + "), wynosi: " + shapeCalculator.volume((Shape3D) shapes[i])));
            } else if(shapes[i] instanceof Cube){
            System.out.println("Objętość sześcianu o szerokości "+((Cube) shapes[i]).getWidth() +
                    "któredo początek jest położony w punkcie ("+point3D.getX3D()+", "+point3D.getY3D()+" ,"
                    +point3D.getZ3D() + "), wynosi: " + shapeCalculator.volume((Shape3D) shapes[i]));
        }



        }
    }
}
