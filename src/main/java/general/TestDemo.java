package main.java.general;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestDemo {

    @Test
    public void titleCheck() throws MalformedURLException {

        //WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.139:4444"), caps);
        MutableCapabilities caps = new MutableCapabilities();

        WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().matches("Selenium, API Testing, Software Testing & More QA Tutorials  | Rahul Shetty Academy"));
        driver.quit();

    }
}
