package TestNGDemo.DemoParameters;

import org.testng.annotations.*;

public class ClassOne {


    @Parameters({"myUrl","username","password"})
    @BeforeClass
    public void beforeMyClass(String v1,String v2,String v3)
    {
        System.out.println("open browser");
        System.out.println("url: "+v1);
        System.out.println("user: "+v2);
        System.out.println("pass: "+v3);
    }


    @Test
    public void classOneTest1()
    {

        System.out.println("classOneTest1");
    }

    @Test
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
