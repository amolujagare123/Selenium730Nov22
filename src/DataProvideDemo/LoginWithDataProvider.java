package DataProvideDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {

    @Test(dataProvider = "getData")
    public void loginTest(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[4][2];

        data[0][0] = "admin"; // username
        data[0][1] = "admin"; // password

        data[1][0] = "xyz";
        data[1][1] = "abc";

        data[2][0] = "invalid";
        data[2][1] = "invalid";

        data[3][0] = "";
        data[3][1] = "";

        return data;
    }
}
