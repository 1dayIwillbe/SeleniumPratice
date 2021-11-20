package jUnit;

import org.junit.*;

public class JUnitIntro {
    @Before
    public void openBrowser() {
        System.out.println("Opening Browser");
    }



 @After
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        System.out.println("Navigate to login Page");
    }

    @Test
    public void test1() {
        System.out.println("Navigate to login Page 2");
    }


}