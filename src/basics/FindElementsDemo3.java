package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://darksky.net/forecast/28.627,77.2154/us12/en");


         List<WebElement> wbList = driver.findElements(By.xpath("//span[@class='hour']/span"));


         for (int i=0;i<wbList.size();i++)
             System.out.println(wbList.get(i).getText());


    }
}
