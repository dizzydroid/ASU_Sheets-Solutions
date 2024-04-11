import javafx.geometry.Point2D;

public class EllipseModified implements Shape {
    private Point2D start;
    private double length;
    private double width;

    public EllipseModified(Point2D start, double length, double width) {
        this.start = start;
        this.length = length;
        this.width = width;
    }

    @Override
    public Point2D getStartPoint() {
        return start;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Ellipse at " + start + " with length " + length + " and width " + width);
    }
}
