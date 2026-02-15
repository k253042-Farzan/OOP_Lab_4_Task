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
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung");
        Mobile m3 = new Mobile("Apple", "iPhone 14");
        Mobile m4 = new Mobile("Xiaomi", "Redmi Note 12", 65000);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
}