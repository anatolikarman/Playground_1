import lombok.SneakyThrows;
import org.testcontainers.containers.GenericContainer;

import java.net.URL;

public class SeleniumContainer extends GenericContainer<SeleniumContainer> {
    int seleniumPort = 4444;
    public SeleniumContainer() {
        super("selenium/standalone-chrome:127.0");
        withExposedPorts(seleniumPort);
    }

    @SneakyThrows
    public URL getAddress() {
        return new URL("http", this.getHost(), this.getMappedPort(seleniumPort), "/wd/hub");
    }
}