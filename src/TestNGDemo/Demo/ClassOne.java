package TestNGDemo.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {


    @BeforeTest
    public void myBeforeTest()
    {
        System.out.println("myBeforeTest");
    }

    @AfterTest
    public void myAfterTest()
    {
        System.out.println("myAfterTest");
    }


    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Test (groups = "email")
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
