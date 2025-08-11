public class Library {
    class Book {
        String title;
        Book(String title) {
            this.title = title;
        }
        void display() {
            System.out.println("Book Title: " + title);
        }
    }
    public static void main(String[] args) {
        Library library = new Library();
        Library.Book book = library.new Book("Java for Beginners");
        book.display();
    }
}