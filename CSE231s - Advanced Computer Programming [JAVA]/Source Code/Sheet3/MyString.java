public class MyString {
    private final char[] data; // Character array to store the string (final for immutability)

    // Constructor
    public MyString(String str) {
        data = str.toCharArray();
    }

    // Print the string
    public void print() {
        System.out.println(data);
    }

    // Find the index of a character
    public int indexOf(char c) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == c) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Get the length of the string
    public int length() {
        return data.length;
    }

    // Extract a substring (returns a new MyString object)
    public MyString substring(int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > data.length || beginIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }
        return new MyString(new String(data, beginIndex, endIndex - beginIndex));
    }

    // Example usage
    public static void main(String[] args) {
        MyString str = new MyString("Hello, World!");

        str.print(); // Output: Hello, World!

        int index = str.indexOf('o');
        System.out.println("Index of 'o': " + index); // Output: 4

        MyString subStr = str.substring(7, 13); // Extract "World"
        subStr.print(); // Output: World
    }
}