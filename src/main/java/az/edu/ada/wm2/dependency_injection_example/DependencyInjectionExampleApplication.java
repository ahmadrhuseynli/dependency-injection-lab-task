package az.edu.ada.wm2.dependency_injection_example;

import az.edu.ada.wm2.dependency_injection_example.beans.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionExampleApplication.class, args);

        // Each call creates a new Order instance because orderBean is prototype scoped.
        var order1 = context.getBean("orderBean", Order.class);
        var order2 = context.getBean("orderBean", Order.class);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println("Same owner instance? " + (order1.getOwner() == order2.getOwner()));
    }
}
