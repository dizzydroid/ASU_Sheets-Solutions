import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
public class BookStore {
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

    public BookStore(){
        this.ID = nextId; // Assign unique ID from the counter
        nextId++; // Increment the counter for the next object
    }

    public int getId() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many books are you providing?");
        int books = input.nextInt();
        int[] numBooks = new int[books];
        List <BookStore> bookList = new ArrayList<BookStore>();
        for (int i = 0; i < numBooks.length; i++){
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Type\n(1) for a TextBook\n(2) for an AudioBook");
            int bookType = input.nextInt();
            if (bookType == 1){
                TextBook newTextBook = new TextBook();
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
                AudioBook newAudioBook = new AudioBook();
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
        for (BookStore book : bookList) {
            System.out.println("ID: " + book.getId()); // Print ID
            System.out.println("Title: " + book.getTitle());
            System.out.println("Release Date: " + book.getReleaseDate());
            System.out.println("Price: $" + book.getPrice());

            if (book.isType().equalsIgnoreCase("textbook")) {
                System.out.println("Number of Pages: " + ((TextBook) book).getNumPages());
            } else {
                System.out.println("Length (minutes): " + ((AudioBook) book).getLenInPages());
            }

            System.out.println("====================================");
        }
        input.close();
    }
    
}
