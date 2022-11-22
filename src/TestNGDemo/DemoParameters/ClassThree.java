package TestNGDemo.DemoParameters;

import org.testng.annotations.*;

public class ClassThree {

    @Parameters({"myUrl","username","password"})
    @BeforeClass
    public void beforeMyClass(String v1,String v2,String v3)
    {
        System.out.println("url: "+v1);
        System.out.println("user: "+v2);
        System.out.println("pass: "+v3);
    }



    @Test
    public void classThreeTest1()
    {

        System.out.println("classThreeTest1");
    }

    @Test
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
