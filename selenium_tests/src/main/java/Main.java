import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {
    public static void main(String[] args) {
        SeleniumContainer seleniumContainer = new SeleniumContainer();

        seleniumContainer.start();
        Capabilities capabilities = new ChromeOptions();

        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(seleniumContainer.getAddress(), capabilities);
        remoteWebDriver.get("https://www.saucedemo.com/");
        System.out.println(remoteWebDriver.getCurrentUrl());
    }

}
