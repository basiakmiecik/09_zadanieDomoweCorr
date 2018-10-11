public class ShapeTest {
    public static void main(String[] args) {

        Point2D point2D= new Point2D(0,0);//punkt w któtym jest początek figury
        Point2D point2D1=new Point2D(10,10);
        Ball ball = new Ball (10);
        Cube cube= new Cube(10);
        Circle circle= new Circle(10);
        Rectangle rectangle= new Rectangle(2,10);
        Line2D line2D= new Line2D(point2D,point2D1);


        ShapeCalculator shapeCalculator= new ShapeCalculator();
        LineCalc lineCalc= new LineCalc();


        /*System.out.println("Objętość kuli wynosi: "+shapeCalculator.ballVolume(ball)+
                "\nObjętość sześcianu wynosi: "+shapeCalculator.cubeVolume(cube)+
                "\nPole koła wynosi: "+shapeCalculator.circleArea(circle)+
                "\nPole prostokąta wynosi: "+shapeCalculator.rectangleArea(rectangle)+
                "\nDługość odcinka wynosi: "+lineCalc.lineLength(line2D));*/
    }
}
