package randomCodes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestJavaClass {

    //For multiple parameter pass we have to define them in array
    @Parameters({"integerOne", "integerTwo"})
    @Test(groups = {"TestOne"})
    void twoNumberAdd(int a, int b) {
        //This method was created for testng about multiple parameter pass and test
        //Also for test of method running on same testng xml file with different java class files and their methods altogether
        System.out.println(a + b);
    }
}
