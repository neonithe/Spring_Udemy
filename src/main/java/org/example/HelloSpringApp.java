package org.example;

import org.example.modul.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // Load the spring the config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("newCoach", Coach.class);
        Coach newCoach = context.getBean("myCoach", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(newCoach.getDailyWorkout());

        // Close the context
        context.close();
        
    }

}
