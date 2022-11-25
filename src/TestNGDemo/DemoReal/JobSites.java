package TestNGDemo.DemoReal;

import TestNGDemo.DemoReal.util.InitBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends InitBrowser {



    @Test (priority = 1)
    public void naukri()
    {
        driver.get("http://naukri.com");
    }

    @Test  (priority = 4)  //(enabled = false)
    public void monster()
    {
        driver.get("http://monster.com");
    }

    @Test (priority = 3)
    public void shine()
    {
        driver.get("http://shine.com");
    }

    @Test (priority = 2)
    public void timesjobs()
    {
        driver.get("http://timesjobs.com");
    }



}
