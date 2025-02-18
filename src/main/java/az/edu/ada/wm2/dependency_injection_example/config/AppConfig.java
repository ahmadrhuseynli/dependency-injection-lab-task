package az.edu.ada.wm2.dependency_injection_example.config;

import az.edu.ada.wm2.dependency_injection_example.beans.Order;
import az.edu.ada.wm2.dependency_injection_example.beans.Person;
import az.edu.ada.wm2.dependency_injection_example.beans.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import java.util.Collections;
import java.util.List;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class AppConfig {

    // -- PERSON BEANS --
    @Bean
    public Person personBean() {
        Person person = new Person();
        person.setId("PER001");
        person.setFirstName("John");
        person.setLastName("Doe");
        return person;
    }

    @Bean
    public Person anotherPersonBean() {
        return new Person("PER002", "Foo", "Bar");
    }

    // -- PRODUCT BEANS --
    @Bean
    public Product defaultProduct() {
        Product product = new Product();
        product.setId("P001");
        product.setName("Laptop");
        product.setPrice(2000.0);
        return product;
    }

    @Bean
    public Product anotherProductBean() {
        return new Product("P002", "PC", 1500.0);
    }

    // -- ORDER BEAN --
    @Bean
    @Scope("prototype")
    public Order orderBean(
            @Qualifier("personBean") Person owner,
            @Qualifier("productBean") Product product
    ) {
        Order order = new Order();
        order.setOwner(owner);
        order.setProducts(List.of(product));
        return order;
    }

}
