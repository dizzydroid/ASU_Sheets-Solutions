import javafx.geometry.Point2D;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        LineModified lineModified = new LineModified(new Point2D(0, 0), new Point2D(10, 10));
        RectangleModified rectangleModified = new RectangleModified(new Point2D(5, 5), 2, 3);
        EllipseModified ellipseModified = new EllipseModified(new Point2D(3, 3), 4, 2);

        canvas.addShape(lineModified);
        canvas.addShape(rectangleModified);
        canvas.addShape(ellipseModified);

        System.out.println("Drawing all shapes on the canvas:");
        canvas.drawAll();

        Point2D testPoint = new Point2D(4, 4);
        Shape closest = canvas.getShape(testPoint);
        System.out.println("\nThe closest shape to " + testPoint + " is:");
        closest.draw();

        System.out.println("\nRemoving the closest shape and drawing again:");
        canvas.removeShape(closest);
        canvas.drawAll();
    }
}
