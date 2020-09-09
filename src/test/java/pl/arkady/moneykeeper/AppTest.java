package pl.arkady.moneykeeper;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class AppTest {

    @Test
    public void someMethod_shouldReturn() {
        // given
        App app = new App();

        // when
        int result = app.someMethod();

        // then
        assertThat(result, is(15));
    }

}