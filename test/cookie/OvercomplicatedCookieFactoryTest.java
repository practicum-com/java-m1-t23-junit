package cookie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class OvercomplicatedCookieFactoryTest {

    private static OvercomplicatedCookieFactory cookieFactory;

    @BeforeEach
    public void beforeEach() {
         cookieFactory = new OvercomplicatedCookieFactory(
                Collections.singletonList("You'll be lucky!"),
                Collections.singletonList("It'll rain today."),
                true
        );
    }

    @Test
    public void shouldReturnPositiveCookie() {
        String cookieText = cookieFactory.bakeFortuneCookie();
        Assertions.assertEquals("You'll be lucky!", cookieText);
    }

    @Test
    public void shouldIncreaseCounterByOneAfterCookieBaked() {
        cookieFactory.bakeFortuneCookie();
        Assertions.assertEquals(1, cookieFactory.getCookiesCreated());
    }
}
