package TestNGDemo.DemoReal.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InitBrowser {

    public static WebDriver driver;

    @BeforeClass // this method will run before first test of this class
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // this method will run after last test of this class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}
