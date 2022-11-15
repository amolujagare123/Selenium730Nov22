package xpathdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ViewCustomerEdit {

    public static void main(String[] args) {

       // WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();

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

        WebElement lnlViewCustomer = driver.findElement(By.xpath("//a[text()='View Customers']"));
        lnlViewCustomer.click();

        String name = "Renu";

        driver.findElement(By.xpath("//tr[  td[text()='"+name+"']  ]//input")).click();

    }
}
