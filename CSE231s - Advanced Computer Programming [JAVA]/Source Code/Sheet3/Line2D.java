import javafx.geometry.Point2D;

public class Line2D {
    private Point2D position;
    private Vector direction;

    // Constructor with Point2D and Vector objects
    public Line2D(Point2D position, Vector direction) {
        this.position = position;
        this.direction = direction;
    }

    // Constructor with coordinates for position and direction
    public Line2D(double xPos, double yPos, double xDir, double yDir) {
        this.position = new Point2D(xPos, yPos);
        this.direction = new Vector(xDir, yDir);
    }

    // Print method
    public void print() {
        System.out.println("Line: Position = " + position + ", Direction = " + direction.toString());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create lines using different constructors
        Line2D line1 = new Line2D(new Point2D(2, 3), new Vector(1, 2));
        Line2D line2 = new Line2D(5, 6, 3, 4);

        // Print line information
        line1.print();
        line2.print();
    }
}