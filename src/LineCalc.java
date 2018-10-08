public class LineCalc extends ShapeCalculator{
    double length;
    public double lineLength(Line2D line2D){
        length=Math.sqrt(Math.pow(line2D.getPoint2DEnd().getX2D()-line2D.getPoint2D().getX2D(),2)
                +Math.pow(line2D.getPoint2DEnd().getY2D()-line2D.getPoint2D().getY2D(),2));
    return length;}
}
