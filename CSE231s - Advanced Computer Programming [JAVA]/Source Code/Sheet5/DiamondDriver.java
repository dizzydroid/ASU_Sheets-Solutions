import javafx.geometry.Point2D;
public class DiamondDriver {
    public static void main(String[] args) {
        Diamond diamond1 = new Diamond(new Point2D(1, 1), 4, 3);
        Diamond diamond2 = new Diamond(new Point2D(2, 2), 5, 2);

        System.out.println("Before moving:");
        diamond1.draw();

        diamond1.move(3, 3);
        
        System.out.println("After moving:");
        diamond1.draw();

        int comparisonResult = diamond1.compareTo(diamond2);
        if (comparisonResult > 0) {
            System.out.println("Diamond1 is larger than Diamond2.");
        } else if (comparisonResult < 0) {
            System.out.println("Diamond1 is smaller than Diamond2.");
        } else {
            System.out.println("Diamond1 and Diamond2 are of the same size.");
        }
    }
}
