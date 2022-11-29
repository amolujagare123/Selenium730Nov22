package DataProvideDemo;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginWithDataProviderExHeaders {

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
    public Object[][] getData() throws IOException {

        FileInputStream fis = new FileInputStream("Data/MyData.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheet("Sheet2");
        int rowCount = sheet.getPhysicalNumberOfRows(); // 7

        Object[][] data = new Object[rowCount-1][2]; // 6

        for (int i=0;i<rowCount-1;i++)
        {
            HSSFRow row  = sheet.getRow(i+1);
           // HSSFCell cell = row.getCell(0);
            data[i][0] = row.getCell(0).toString().trim();
            data[i][1] = row.getCell(1).toString().trim();
        }

       /* data[0][0] = "admin"; // username
        data[0][1] = "admin"; // password

        data[1][0] = "xyz";
        data[1][1] = "abc";

        data[2][0] = "invalid";
        data[2][1] = "invalid";

        data[3][0] = "";
        data[3][1] = "";*/

        return data;
    }
}
