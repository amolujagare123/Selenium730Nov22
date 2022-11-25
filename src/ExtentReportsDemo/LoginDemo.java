package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static AssertsDemo.screenshot.ScreenshotDemo.getMyScreenshot;

public class LoginDemo {

    ExtentReports extent;

    @BeforeClass
    public void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("/Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock management system");
        reporter.config().setReportName("regression testing report");


        extent.setSystemInfo("Developer name","Amit");
        extent.setSystemInfo("Tester name","Purushottam");
        extent.setSystemInfo("Project name","Stock Management");
        extent.setSystemInfo("Dead Line","25 Dec 22");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush(); // writes to report
    }



    @Test
    public void loginTest1() throws IOException {

        ExtentTest test = extent.createTest("Valid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        test.info("browser is opened and url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("user name is entered");


        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

      /*  System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This test is pass");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }

    }

    @Test
    public void loginTest2() throws IOException {
        ExtentTest test = extent.createTest("invalid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        test.info("browser is opened and url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsdsd");

        test.info("user name is entered");


        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsdsd");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "https://stock.amolujagare.com/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();

      /*  System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        try {
            Assert.assertEquals(actual, expected, "wrong or no error message");
            test.pass("This test is pass");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }

    }

    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("blank login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        test.info("browser is opened and url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("user name is entered");


        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "https://stock.amolujagare.com/";
        String actual = driver.getCurrentUrl();

      /*  System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        try {
            Assert.assertEquals(actual, expected, "wrong or no error message");
            test.pass("This test is pass");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }

    }
}
