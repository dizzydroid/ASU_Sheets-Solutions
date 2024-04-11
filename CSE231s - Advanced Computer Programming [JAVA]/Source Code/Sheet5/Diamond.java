import javafx.geometry.Point2D;

public class Diamond implements Shape, Moveable, Comparable<Diamond> {
    private Point2D start;
    private double length;
    private double width;

    public Diamond(Point2D start, double length, double width) {
        this.start = start;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Diamond at " + start + " with length " + length + " and width " + width);
    }

    @Override
    public Point2D getStartPoint() {
        return start;
    }

    @Override
    public void move(double dx, double dy) {
        start = start.add(dx, dy);
    }

    @Override
    public int compareTo(Diamond other) {
        double myArea = this.length * this.width;
        double otherArea = other.length * other.width;
        return Double.compare(myArea, otherArea);
    }
}
