package org.springproject.myproject.ques3;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(org.springproject.myproject.ques3.Main.class);
        CarType obj =  app.getBean(CarType.class);
        obj.print();

    }

}
