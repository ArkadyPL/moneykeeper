package pl.arkady.moneykeeper;

import org.junit.jupiter.api.Test;
import pl.arkady.moneykeeper.app.AService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class AServiceTest {

    @Test
    public void someMethod_shouldReturn() {
        // given
        AService aService = new AService(null);

        // when
        int result = aService.someMethod();

        // then
        assertThat(result, is(15));
    }

}