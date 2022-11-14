package xpathdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LongLink {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample");

       // driver.findElement(By.xpath("//a[text()=' please click here to go to the facebook page ']")).click();
        driver.findElement(By.xpath("//a[contains(text() , 'facebook')]")).click();
    }

    }
