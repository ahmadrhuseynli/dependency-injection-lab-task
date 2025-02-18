package az.edu.ada.wm2.dependency_injection_example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Order {
    @Autowired
    @Qualifier("productBean")
    private Product defaultProduct;
    private String id;
    private Person owner;
    private List<Product> products;
    private Double total;

    // Default constructor
    public Order() {
    }

    // Parameterized constructor
    public Order(String id, Person owner, List<Product> products, Double total) {
        this.id = id;
        this.owner = owner;
        this.products = products;
        this.total = total;
    }

    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for owner
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // Getter and Setter for products
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Getter and Setter for total
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    // Optional: Override toString() for better logging and debugging output
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", owner=" + owner +
                ", products=" + products +
                ", total=" + total +
                '}';
    }
}
