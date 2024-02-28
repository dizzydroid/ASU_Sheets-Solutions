public class ArrayMagnitude extends Vector{
    // average magnitude method
    public static double averageMagnitude(Vector[] vectors){
        double sum = 0;
        for (Vector vector : vectors){
            sum += vector.magnitude();
        }
        return sum / vectors.length;
}

    /** Main method */
    public static void main(String[] args){
        // test cases
        Vector[] vectors = new Vector[3];
        vectors[0] = new Vector(3,4);
        vectors[1] = new Vector(4,5);
        vectors[2] = new Vector(5,6);
        System.out.println("Average magnitude: " + averageMagnitude(vectors));
    }
}
