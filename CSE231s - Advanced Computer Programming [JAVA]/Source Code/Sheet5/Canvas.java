import javafx.geometry.Point2D;
import java.util.ArrayList;

public class Canvas {
    private ArrayList<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getShape(Point2D point) {
        Shape closestShape = null;
        double minDistance = Double.MAX_VALUE;
        for (Shape shape : shapes) {
            double distance = shape.getStartPoint().distance(point);
            if (distance < minDistance) {
                minDistance = distance;
                closestShape = shape;
            }
        }
        return closestShape;
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
