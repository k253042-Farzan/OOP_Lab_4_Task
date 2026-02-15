class LibraryBook {
    String title;
    int price;

    LibraryBook() {
        title = "Unknown";
        price = 0;
    }

    LibraryBook(String t) {
        title = t;
        price = 500;
    }

    LibraryBook(String t, int p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook();

        LibraryBook b2 = new LibraryBook("Java Programming");

        LibraryBook b3 = new LibraryBook("Ethical Hacking", 1500);

        b1.display();
        b2.display();
        b3.display();
    }

}
