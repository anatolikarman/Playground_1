import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
    static RemoteWebDriver remoteWebDriver;

    @BeforeEach
    private void setup() {
        SeleniumContainer seleniumContainer = new SeleniumContainer();

        seleniumContainer.start();
        Capabilities capabilities = new ChromeOptions();

        remoteWebDriver = new RemoteWebDriver(seleniumContainer.getAddress(), capabilities);
    }

    protected void open(String url) {
        remoteWebDriver.get(url);
    }

    protected String getCurrentUrl() {
        return remoteWebDriver.getCurrentUrl();
    }
}
