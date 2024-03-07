public class AudioBookModified extends BookStoreModified {
    int lenInPages;
    public double getLenInPages() {
        // print the length in pages of the object
        System.out.println("Length in Pages: " + lenInPages);
        // return the length in pages of the object
        return lenInPages;
    }
    public void setLenInPages(int lenInPages) {
        this.lenInPages = lenInPages;
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\nTitle: " + Title + "\nRelease Date: " + releaseDate + "\nPrice: " + price + "\nLength in Pages: " + lenInPages;
    }

    @Override
    public void print() {
        System.out.println("ID: " + ID + "\nTitle: " + Title + "\nRelease Date: " + releaseDate + "\nPrice: " + price + "\nLength in Pages: " + lenInPages);
    }
}
