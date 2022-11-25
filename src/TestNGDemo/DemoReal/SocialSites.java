package TestNGDemo.DemoReal;

import TestNGDemo.DemoReal.util.InitBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends InitBrowser {



    @Test
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test
    public void linkedin()
    {
        driver.get("http://linkedin.com");

        Assert.assertEquals(driver.getTitle(),"lnkedIn",
                "this is not a linked in page");
    }

    @Test
    public void twitter()
    {
        driver.get("http://twitter.com");
    }

    @Test
    public void instagram()
    {
        driver.get("http://instagram.com");
    }



}
