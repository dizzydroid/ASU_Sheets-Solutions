public class MyStringBuffer {
    private char[] data; // character array to store the string

    // Default constructor
    public MyStringBuffer(String str){
        data = str.toCharArray(); // initialize with passed string
    }

    // Print method -> prints current string
    public void print(){
        System.out.println(data);
    }
    // indexOf method -> Returns the index of the specified character in the current object or -1 if not found.
    public int indexOf(char c){
        for (int i = 0; i < data.length; i++) {
            if (data[i] == c) {
                return i;
            }
        }
        return -1; // Not found
    }
    // length method -> Returns the length of the string
    public int length() {
        return data.length;
    }
    // erase method -> Modifies the current object by erasing a substring whose position and length are specified by the passed values.
    public void erase(int index, int length) {
        if (index < 0 || index >= data.length || length < 0) {
            throw new IndexOutOfBoundsException();
        }
        char[] newData = new char[data.length - length]; // Create new array with length - length
        System.arraycopy(data, 0, newData, 0, index); // Copy data before index
        System.arraycopy(data, index + length, newData, index, data.length - index - length); // Copy data after index + length
        data = newData; // Set data to new array
    }
    // insert method -> Modifies the current object by inserting the specified string at the specified position.
    public void insert(int index, String str) {
        if (index < 0 || index > data.length) {
            throw new IndexOutOfBoundsException();
        }
        char[] newData = new char[data.length + str.length()]; // Create new array with length + str.length
        System.arraycopy(data, 0, newData, 0, index); // Copy data before index
        System.arraycopy(str.toCharArray(), 0, newData, index, str.length()); // Copy str at index position in newData array 
        System.arraycopy(data, index, newData, index + str.length(), data.length - index); // Copy data after index
        data = newData;
    }

    // Example usage
    public static void main(String[] args) {
        MyStringBuffer buffer = new MyStringBuffer("Hello World");

        // Testing print method
        buffer.print();  // Expected: Hello World

        // Testing indexOf method
        int index_of_o = buffer.indexOf('o');  // Expected: 4

        // Testing length method
        int length = buffer.length();  // Expected: 11

        // Testing erase method
        buffer.erase(5, 6);  // Should remove " World"
        buffer.print();  // Expected: Hello

        // Testing insert method
        buffer.insert(5, ", Universe!");
        buffer.print();  // Expected: Hello, Universe!

        // Displaying indexOf and length results
        System.out.println("Index of 'o': " + index_of_o + ", Length: " + length);
}

}

// Congrats, we just re-invented the wheel :|