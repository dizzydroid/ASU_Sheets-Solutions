import javafx.geometry.Point2D;
public class LineModified implements Shape {
    private Point2D start;
    private Point2D end;

    public LineModified(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Point2D getStartPoint() {
        return start;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line from " + start + " to " + end);
    }
}
