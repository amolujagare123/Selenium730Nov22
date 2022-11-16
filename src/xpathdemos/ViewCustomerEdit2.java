package xpathdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ViewCustomerEdit2 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       // WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
        lnkAddCustomer.click();

        WebElement lnlViewCustomer = driver.findElement(By.xpath("//a[contains(text(),'View Client')]"));
        lnlViewCustomer.click();

        String name = "Ajay Singh";

  //      driver.findElement(By.xpath("//tr[  td[text()='"+name+"']  ]//input")).click();


        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//div")).click();

        //tr[td/a[text()='Ajay Singh']]//li[2]

//tr[td/a[text()='Ajay Singh']]//a[contains(@href,'form')]

//tr[td/a[text()='Ajay Singh']]//i[contains(@class,'edit')]

        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//i[contains(@class,'edit')]")).click();

    }
}
