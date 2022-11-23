package AssertsDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertDemoAddCustomer2 {


    @Test
    public void addCustomerTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        lnkAddCustomer.click();

        String name = "Monika11";

        WebElement txtName = driver.findElement(By.id("name"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz, abc , pune");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("787878787");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("187878787");

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();

        String expected = "Customer Details Added";
        String actual = "";

        try
        {
            actual = driver.findElement(By.xpath("//div[contains(@class,'box round')]")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"wrong message / customer is not added");
    }
}
