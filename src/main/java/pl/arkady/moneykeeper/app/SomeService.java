package pl.arkady.moneykeeper.app;

import org.springframework.stereotype.Component;

@Component
public class SomeService {

    SomeService() {
        System.out.println("SomeService started");
    }

    public int doSomeJob(int x) {
        return x * 2;
    }
}
