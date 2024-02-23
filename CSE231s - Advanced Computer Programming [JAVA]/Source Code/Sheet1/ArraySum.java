public class ArraySum {
    // array summation method
    public static int sumArray(int[] array){
        int sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum;
    }
    public static void main(String args[]){
        int[] testCase = {1,2,3,4,5};
        System.out.println(sumArray(testCase));
    }
}


/* Alternative Solution:
=======================================================
public class ArraySum {
    // array summation method
    public int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void main(String args[]){
        ArraySum testCases = new ArraySum();
        int[] testCase = {1,2,3,4,5};
        System.out.println(testCases.sumArray(testCase));
    }
}
*/