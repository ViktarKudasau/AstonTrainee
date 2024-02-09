package Tests;

import org.testng.annotations.Test;
import pageObjects.Singleton;

public class SingletonTest {

    @Test
    public void getSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1 = " + instance1.toString());
        System.out.println("instance2 = " + instance2.toString());
    }
}
