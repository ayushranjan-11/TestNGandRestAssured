package learning;

import org.testng.annotations.Test;

/* This class was created for learning of dependsOnMethod use and implementation
* dependsOnMethods is used to depends one method to another
* Failure of depender method skips execution of dependent method
* dependsOnMethods have higher precedence than priority (with priority and dependsOnMethods, methods
* with dependsOnMethods order will be executed)
* */

public class DependsOnMethodClass {

    @Test(priority = 3)
    void methodIndependent() {
//        System.out.println(5/0); {This is to have Arithmetic exception}
        System.out.println("Independent method");
    }

    @Test(priority = 1 ,dependsOnMethods = {"methodIndependent"}, alwaysRun = true) //Adding alwaysRun = true will run this method even if depender test has failed to execute
    void methodDependent() {
        System.out.println("Dependent method 1");
    }

    @Test(priority = 2 , dependsOnMethods = {"methodIndependent", "methodDependent"}, ignoreMissingDependencies = true) //Adding ignoreMissingDependencies = true will run the method when depender method is ignored/skipped/deleted or not found
    void methodDependentTwo() {
        System.out.println("Dependent method 2");
    }
}
