import javafx.geometry.Point2D;

public class Line implements Drawable {
    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Point2D getStart() {
        return start;
    }

    public Point2D getEnd() {
        return end;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line from " + start + " to " + end);
    }
}
