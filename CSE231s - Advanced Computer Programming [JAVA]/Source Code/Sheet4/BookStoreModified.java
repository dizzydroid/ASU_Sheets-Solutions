import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
public class BookStoreModified {
    private static int nextId = 1; // Static counter for unique IDs
    int ID;
    String Title;
    LocalDate releaseDate;
    double price;
    boolean type;

    public String isType() {
        if (type == true){
            return "textbook";
        } else {
            return "audiobook";
        }
    }
    public void setType(boolean type) {
        this.type = type;
    }

    public BookStoreModified(){
        this.ID = nextId; // Assign unique ID from the counter
        nextId++; // Increment the counter for the next object
    }

    public int getId() {
        // print the ID of the object
        System.out.println("ID: " + ID);
        // return the ID of the object
        return ID;
    }

    public String getTitle() {
        // print the title of the object
        System.out.println("Title: " + Title);
        // return the title of the object
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public LocalDate getReleaseDate() {
        // print the release date of the object
        System.out.println("Release Date: " + releaseDate);
        // return the release date of the object
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        // print the price of the object
        System.out.println("Price: " + price);
        // return the price of the object
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // toString method to print the object
    public String toString() {
        return "ID: " + ID + "\nTitle: " + Title + "\nRelease Date: " + releaseDate + "\nPrice: " + price;
    }

    // Equals method to compare objects
    public boolean equals(BookStoreModified book) {
        if (this.ID == book.ID) {
            return true;
        } else {
            return false;
        }
    }

    // Print method to print the object
    public void print() {
        System.out.println("ID: " + ID + "\nTitle: " + Title + "\nRelease Date: " + releaseDate + "\nPrice: " + price);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many books are you providing?");
        int books = input.nextInt();
        int[] numBooks = new int[books];
        List <BookStoreModified> bookList = new ArrayList<BookStoreModified>();
        for (int i = 0; i < numBooks.length; i++){
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Type\n(1) for a TextBook\n(2) for an AudioBook");
            int bookType = input.nextInt();
            if (bookType == 1){
                TextBookModified newTextBook = new TextBookModified();
                newTextBook.setType(true);
                System.out.println("What is the title of your TextBook?");
                input.nextLine();  // consume the leftover newline
                newTextBook.setTitle(input.nextLine());
                System.out.println("What is the release date of your TextBook? (Write in the format of YYYY-MM-DD)");
                newTextBook.setReleaseDate(LocalDate.parse(input.next()));
                System.out.println("What is the price of your TextBook?");
                newTextBook.setPrice(input.nextDouble());
                System.out.println("How many pages does your TextBook have?");
                newTextBook.setNumPages(input.nextInt());
                bookList.add(newTextBook);
            } else if (bookType == 2){
                AudioBookModified newAudioBook = new AudioBookModified();
                newAudioBook.setType(false);
                System.out.println("What is the title of your AudioBook?");
                input.nextLine();  // consume the leftover newline
                newAudioBook.setTitle(input.nextLine());
                System.out.println("What is the release date of your AudioBook? (Write in the format of YYYY-MM-DD)");
                newAudioBook.setReleaseDate(LocalDate.parse(input.next()));
                System.out.println("What is the price of your AudioBook?");
                newAudioBook.setPrice(input.nextDouble());
                System.out.println("What is the length of your AudioBook in minutes?");
                newAudioBook.setLenInPages(input.nextInt());
                bookList.add(newAudioBook);
                
            }
        }
        System.out.println("\nEntered Books:");
        // using the getters to print the objects
        for (int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
       /* // using the print method to print the objects
        for (int i = 0; i < bookList.size(); i++){
            bookList.get(i).print();
        } */
        input.close();
    }
    
}
