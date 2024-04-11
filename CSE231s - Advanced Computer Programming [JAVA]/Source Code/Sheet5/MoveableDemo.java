import javafx.geometry.Point2D;
import java.util.Arrays;

public class MoveableDemo {

    public static void main(String[] args) {
        int N = 5; // Example size of the array
        Moveable[] moveables = new Moveable[N];

        // Filling the array with Diamond objects
        moveables[0] = new Diamond(new Point2D(0, 0), 10, 5);
        moveables[1] = new Diamond(new Point2D(1, 1), 6, 4);
        moveables[2] = new Diamond(new Point2D(2, 2), 8, 3);
        moveables[3] = new Diamond(new Point2D(3, 3), 4, 7);
        moveables[4] = new Diamond(new Point2D(4, 4), 5, 5);

        // Moving each Diamond
        for (Moveable moveable : moveables) {
            moveable.move(1, 1); // Moving every diamond by an arbitrary amount (dx=1, dy=1)
        }

        // Casting to Diamond[] for sorting (Arrays.sort() requires Comparable[] type)
        Arrays.sort((Diamond[]) moveables);

        // Drawing each Diamond after sorting
        for (Moveable moveable : moveables) {
            ((Diamond) moveable).draw(); // Casting is required because Moveable doesn't have the draw() method
        }
    }
}
