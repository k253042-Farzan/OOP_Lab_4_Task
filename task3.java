class Mobile {
    String brand;
    String model;
    int price;

    Mobile() {
        this("Unknown", "Unknown", 0);  
    }

    Mobile(String b) {
        this(b, "Unknown", 0);           
    }

    Mobile(String b, String m) {
        this(b, m, 0);                  
    }

    Mobile(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung", "S25 Ultra", 300000);
        Mobile m3 = new Mobile("Apple", "iPhone 17 Pro");
        Mobile m4 = new Mobile("Nokia", "Nokia 3310", 3000);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }

}