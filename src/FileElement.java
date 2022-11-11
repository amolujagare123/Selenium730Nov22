import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample/");

        WebElement fileSelection = driver.findElement(By.xpath("/html/body/input[1]"));
        fileSelection.sendKeys("C:\\Users\\amolu\\Downloads\\1661142959.png");


    }
}
