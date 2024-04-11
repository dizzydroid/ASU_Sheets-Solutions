import javafx.geometry.Point2D;

public class Ellipse implements Drawable {
    private Point2D start;
    private double length;
    private double width;

    public Ellipse(Point2D start, double length, double width) {
        this.start = start;
        this.length = length;
        this.width = width;
    }

    public Point2D getStart() {
        return start;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Ellipse at " + start + " with length " + length + " and width " + width);
    }
}
