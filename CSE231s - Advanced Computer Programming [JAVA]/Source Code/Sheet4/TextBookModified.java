public class TextBookModified extends BookStoreModified {
    int numPages;
    public double getNumPages() {
        // print the number of pages of the object
        System.out.println("Number of Pages: " + numPages);
        // return the number of pages of the object
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    
    @Override
    public String toString() {
        return "ID: " + ID + "\nTitle: " + Title + "\nRelease Date: " + releaseDate + "\nPrice: " + price + "\nNumber of Pages: " + numPages;
    }

    @Override
    public void print() {
        System.out.println("ID: " + ID + "\nTitle: " + Title + "\nRelease Date: " + releaseDate + "\nPrice: " + price + "\nNumber of Pages: " + numPages);
    }
    
}
