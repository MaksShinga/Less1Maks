package HW6;
import java.util.ArrayList;
import java.util.List;
public class Product {
    private String name;
    private String color;
    private double price;

    public Product(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", "black", 1500.0));
        products.add(new Product("Laptop", "silver", 2500.0));
        products.add(new Product("TV", "black", 2000.0));
        products.add(new Product("Camera", "black", 800.0));
        products.add(new Product("Smartwatch", "red", 300.0));

        System.out.println("All products:");
        products.stream()
                .forEach(product -> System.out.println(product.getName()));

        String desiredColor = "black";
        System.out.println("Products with color " + desiredColor + ":");
        products.stream()
                .filter(product -> product.getColor().equals(desiredColor))
                .forEach(product -> System.out.println(product.getName()));

        double desiredPrice = 1000.0;
        System.out.println("Products with price higher than " + desiredPrice + ":");
        products.stream()
                .filter(product -> product.getPrice() > desiredPrice)
                .forEach(product -> System.out.println(product.getName()));
    }
}
