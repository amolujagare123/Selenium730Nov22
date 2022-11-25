package TestNGDemo.DemoReal;

import TestNGDemo.DemoReal.util.InitBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites extends InitBrowser  {




    @Test
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.com");
    }

 /*   @Test
    public void javatpoint()
    {
        driver.get("http://javatpoint.com");
    }

    @Test
    public void tutorialspoint()
    {
        driver.get("https://www.tutorialspoint.com/");
    }*/

    @Test
    public void w3schools()
    {
        driver.get("http://w3schools.com");
    }



}
