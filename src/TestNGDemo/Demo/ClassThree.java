package TestNGDemo.Demo;

import org.testng.annotations.*;

public class ClassThree {

    @BeforeSuite
    public void myBeforeSuite()
    {
        System.out.println("myBeforeSuite");
    }

    @AfterSuite
    public void myAfterSuite()
    {
        System.out.println("myAfterSuite");
    }


    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }

    @Test (groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
