package az.edu.ada.wm2.dependency_injection_example;

import az.edu.ada.wm2.dependency_injection_example.beans.Order;
import az.edu.ada.wm2.dependency_injection_example.beans.Person;
import az.edu.ada.wm2.dependency_injection_example.beans.Product;
import az.edu.ada.wm2.dependency_injection_example.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class DependencyInjectionExampleApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DependencyInjectionExampleApplication.class, args);
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Product product = (Product) context.getBean("productBean");
//        System.out.println(product);
//        Product product2 = context.getBean("productBean", Product.class);
//        System.out.println(product2);
//        System.out.println(product == product2);
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        Person person1 = appContext.getBean(Person.class); //by type only
//        System.out.println(person1);
//        Person person2 = appContext.getBean("personBean", Person.class); //by name
//        System.out.println(person2);
//        System.out.println(person1 == person2);

        // Each call creates a new instance because of the prototype scope.
//        Person person1 = context.getBean("anotherPersonBean", Person.class);
//        Person person2 = context.getBean("anotherPersonBean", Person.class);
//
//        System.out.println("person1: " + person1);
//        System.out.println("person2: " + person2);
//        System.out.println("person1 == person2: " + (person1 == person2));

//        Order order1 = context.getBean("orderBean", Order.class);
//        Order order2 = context.getBean("orderBean", Order.class);
//
//        System.out.println("order1: " + order1);
//        System.out.println("order2: " + order2);
//        System.out.println("Are they the same object? " + (order1 == order2));


        ApplicationContext context =
                SpringApplication.run(DependencyInjectionExampleApplication.class, args);

        var order1 = context.getBean("orderBean", Order.class);
        var order2 = context.getBean("orderBean", Order.class);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order1.getOwner() == order2.getOwner());


    }

}
