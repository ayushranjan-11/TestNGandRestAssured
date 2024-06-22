package randomCodes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class PriorityInTestNG {

    // @Ignore //This way we can ignore the method from java class rather than xml file
    @Test(priority = 1, groups = {"TestOne"})
    void MethodOne() {
        System.out.println("MethodOne");
    }

    @Test(priority = 2, groups = {"TestOne"})
    void MethodTwo() {
        System.out.println("MethodTwo");
    }

    @Test(priority = 3, groups = {"TestTwo"})
    void MethodThree() {
        System.out.println("MethodThree");
    }

    @Test(priority = 4, groups = {"TestOne", "TestTwo"})
    void FourMethod() {
        System.out.println("FourMethod");
    }

    @Test(priority = 5, groups = {"TestTwo"})
    void MethodThisIsFive() {
        System.out.println("MethodThisIsFive");
    }

}
