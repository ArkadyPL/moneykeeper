package pl.arkady.moneykeeper.app;

import org.springframework.stereotype.Component;

@Component
public class AService {

    private final SomeService someService;

    public AService(SomeService someService) {
        this.someService = someService;
    }

    public int methodUsingService(int x) {
        return someService.doSomeJob(x);
    }

    public int someMethod() {
        return 15;
    }
}
