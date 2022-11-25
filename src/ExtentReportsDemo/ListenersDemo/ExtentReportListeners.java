package ExtentReportsDemo.ListenersDemo;

import TestNGDemo.DemoReal.util.InitBrowser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportsDemo.ListenersDemo.utility.Init.getScreenshotForListener;
import static ExtentReportsDemo.ListenersDemo.utility.Init.initExtentReport;

public class ExtentReportListeners extends InitBrowser implements ITestListener {

    static ExtentReports extent;
    ExtentTest test;

    public void onTestStart(ITestResult result) {

         test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {

        test.info(result.getMethod().getMethodName());
        test.pass("this test is passed");

    }

    public void onTestFailure(ITestResult result) {
        test.info(result.getMethod().getMethodName());
        test.info("This test is failed");
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshotForListener(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }

    public void onStart(ITestContext context) {

        if(extent==null)
           extent = initExtentReport();
    }

    public void onFinish(ITestContext context) {
       extent.flush();
    }
}
