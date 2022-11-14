package org.springproject.myproject.ques5;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(Main.class);
        CarType obj =  app.getBean(CarType.class);
        obj.print();

    }

}
