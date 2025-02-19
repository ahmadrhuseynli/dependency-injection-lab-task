package az.edu.ada.wm2.dependency_injection_example.beans;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Order {
    private String id;
    private Person owner;
    private List<Product> products;
    @Value("0.0") // total=0.0 in output
    private Double total;

    public Order() {
    }

    public Order(String id, Person owner, List<Product> products, Double total) {
        this.id = id;
        this.owner = owner;
        this.products = products;
        this.total = total;
    }

    // Getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }

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
