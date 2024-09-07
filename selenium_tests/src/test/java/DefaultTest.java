import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DefaultTest extends BaseTest {

    @Test
    void defaultTest() {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = getCurrentUrl();
        open(expectedUrl);

        assertEquals(actualUrl, actualUrl);
    }
}
