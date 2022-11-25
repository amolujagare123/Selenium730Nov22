package ExtentReportsDemo.ListenersDemo.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Init {


    public static String getScreenshotForListener(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign the current driver to it
        // ( type cast it to  TakesScreenshot)
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts (object reference of TakesScreenshot)
        // it will return a file object store it in File class object
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file ( commons-io jar )
        FileUtils.copyFile(scrFile,new File("Reports\\screenshots\\"+fileName));

        return fileName;

    }


    public static  ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock management system");
        reporter.config().setReportName("regression testing report");


        extent.setSystemInfo("Developer name","Amit");
        extent.setSystemInfo("Tester name","Purushottam");
        extent.setSystemInfo("Project name","Stock Management");
        extent.setSystemInfo("Dead Line","25 Dec 22");

        return extent;
    }
}
