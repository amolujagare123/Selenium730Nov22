import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManagerDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
      /*  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/

    /*    WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();*/


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();


        driver.manage().window().maximize();
        driver.get("https://scriptinglogic.com/");

      //  Thread.sleep(4000);
        driver.navigate().to("http://facebook.com");

     //   Thread.sleep(4000);
        driver.navigate().back();

     //   Thread.sleep(4000);
        driver.navigate().forward();

     //   Thread.sleep(4000);
        driver.navigate().refresh();


    }
}
