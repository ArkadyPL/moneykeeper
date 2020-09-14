package pl.arkady.moneykeeper.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("pl.arkady.moneykeeper");
    }
}
