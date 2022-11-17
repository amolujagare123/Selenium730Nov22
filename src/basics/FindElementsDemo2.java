package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://scriptinglogic.org/");


         List<WebElement> wbList = driver.findElements(By.className("elementor-button-text"));


        System.out.println(wbList.get(0).getText());
        System.out.println(wbList.get(1).getText());

    }
}
