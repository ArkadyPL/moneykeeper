package pl.arkady.moneykeeper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.arkady.moneykeeper.app.AService;
import pl.arkady.moneykeeper.configuration.SpringConfig;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class AServiceTestE2E {

    @Autowired
    private AService aService;

    @Test
    public void someMethod_shouldReturn() {
        // when
        int result = aService.someMethod();

        // then
        assertThat(result, is(15));
    }
}
